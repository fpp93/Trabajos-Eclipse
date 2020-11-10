package Practica2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/practica2" + "?useUnicode=true"+ "&serverTimezone=UTC";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    //scanners que llevan mis parametros de entrada
	    Scanner sc = new Scanner(System.in);
	    Scanner sc1 = new Scanner(System.in);
	    try {
	    	
	    	System.out.println("Introduce el id del producto");
	    	int id=sc.nextInt();
	    	System.out.println("introduce el stock del producto");
	    	int stock=sc1.nextInt();
	    	
	    	Class.forName(nombredriver);
		      Connection con = DriverManager.getConnection(url, "prac2", "pass1234");
		      
		      //en esta query muestro el stock antes del cambio
		      String sql1= "Select Stockanual from productos where ID=?";
		      PreparedStatement stat1=con.prepareStatement(sql1);
		      
		      stat1.setInt(1, id);
		      
		      ResultSet result1 = stat1.executeQuery();
		      
		      while(result1.next()) {
		        	
			         for(int i=1;i<=result1.getMetaData().getColumnCount();i++) {
			        	 if(i==1) {
			        		 System.out.print("Stock antes del cambio:");
			        	 }
			        	 
			        	 System.out.print(result1.getString(i)+ "\t");
			   	      
			        	 
			         }
			         
			         System.out.println(""); 
			        
			            }
		      
		      
		      //aqui cambio el stock con la llamada del procedimiento
		      String sql = "call practica2.CAMBIA_STOCK(?,?)";
		      PreparedStatement stat=con.prepareStatement(sql);
		      stat.setInt(1,id);
		      stat.setInt(2, stock);
		      
		      stat.executeUpdate();
		      
		      
		     //y a qui ya muestro el stock ya modificado
		      System.out.println("-------------------------------");
		      String sql2= "Select Stockanual from productos where ID=?";
		      PreparedStatement stat2=con.prepareStatement(sql2);
		      
		      stat2.setInt(1, id);
		      
		      ResultSet result2 = stat2.executeQuery();
		      while(result2.next()) {
		        	
			         for(int i=1;i<=result1.getMetaData().getColumnCount();i++) {
			        	 if(i==1) {
			        		 System.out.print("Stock despues del cambio:");
			        	 }
			        	 
			        	 System.out.print(result2.getString(i)+ "\t");
			   	      
			        	 
			         }
			         
			         System.out.println(""); 
			        
			            }
		     sc.close();
		     sc1.close();
		      con.close();
	    	
	    }catch(Exception e) {
	    	
	    	e.printStackTrace();
	    }

	}

}
