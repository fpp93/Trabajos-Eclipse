package Practica2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//el ejercicio contiene tres trycatchs cada uno con una query pedida en el enunciado de la practica
		String url = "jdbc:mysql://localhost:3306/practica2" + "?useUnicode=true"+ "&serverTimezone=UTC";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    
	    //query 1
	    try {
	    	Class.forName(nombredriver);
		      Connection con = DriverManager.getConnection(url, "prac2", "pass1234");
		      Statement stat=con.createStatement();
		      
		      String sql = "Select * from clientes where clientes.Poblacion='TOMARES'";
		      ResultSet result = stat.executeQuery(sql);
		      
		      //recorro el result que guarda mi sql con result.next
		      while(result.next()) {
		        	
			         for(int i=1;i<=result.getMetaData().getColumnCount();i++) {
			        	 if(i==1) {
			        		 System.out.print("id:");
			        	 }
			        	 if(i==2) {
			        		 System.out.print("Nombre:");
			        	 }
			        	 if(i==3) {
			        		 System.out.print("direccion:");
			        	 }
			        	 if(i==4) {
			        		 System.out.print("poblacion:");
			        	 }
			        	 if(i==5) {
			        		 System.out.print("telef:");
			        	 }
			        	 if(i==6) {
			        		 System.out.print("NIF:");
			        	 }
			        	 System.out.print(result.getString(i)+ "\t");
			   	      
			        	 
			         }
			         
			         System.out.println(""); 
			        
			            }
		     
	    	
		      con.close();
	    	
	    }catch(Exception e) {
	    	
	    	e.printStackTrace();
	    }
	    
	    
	    
	    System.out.println(" ");
	    System.out.println("----------------------------");
	    System.out.println(" ");
	    
	    
	    
	    //query 2
	    try {
	    	Class.forName(nombredriver);
		      Connection con = DriverManager.getConnection(url, "prac2", "pass1234");
		      Statement stat=con.createStatement();
		      
		      String sql = "Select ID,Descripcion,PVP from productos where productos.Stockanual<productos.Stockminimo";
		      ResultSet result = stat.executeQuery(sql);
		      
		      while(result.next()) {
		        	
			         for(int i=1;i<=result.getMetaData().getColumnCount();i++) {
			        	 if(i==1) {
			        		 System.out.print("id:");
			        	 }
			        	 if(i==2) {
			        		 System.out.print("Descripcion:");
			        	 }
			        	 if(i==3) {
			        		 System.out.print("PVP:");
			        	 }
			        	 
			        	 System.out.print(result.getString(i)+ "\t");
			   	      
			        	 
			         }
			         
			         System.out.println(""); 
			        
			            }
		     
	    	
			con.close();
	    	
	    }catch(Exception e) {
	    	
	    	e.printStackTrace();
	    }
	    
	    System.out.println(" ");
	    System.out.println("----------------------------");
	    System.out.println(" ");
	    
	    
	    
	    //query 3
	    try {
	    	Class.forName(nombredriver);
		      Connection con = DriverManager.getConnection(url, "prac2", "pass1234");
		      Statement stat=con.createStatement();
		      
		      String sql = "select clientes.* from clientes,ventas where clientes.ID=ventas.IDcliente and ventas.Cantidad>30";
		      ResultSet result = stat.executeQuery(sql);
		      
		      while(result.next()) {
		        	
			         for(int i=1;i<=result.getMetaData().getColumnCount();i++) {
			        	 if(i==1) {
			        		 System.out.print("id:");
			        	 }
			        	 if(i==2) {
			        		 System.out.print("Nombre:");
			        	 }
			        	 if(i==3) {
			        		 System.out.print("direccion:");
			        	 }
			        	 if(i==4) {
			        		 System.out.print("poblacion:");
			        	 }
			        	 if(i==5) {
			        		 System.out.print("telef:");
			        	 }
			        	 if(i==6) {
			        		 System.out.print("NIF:");
			        	 }
			        	 
			        	 System.out.print(result.getString(i)+ "\t");
			   	      
			        	 
			         }
			         
			         System.out.println(""); 
			        
			            }
		     
	    	
			
	    	con.close();
	    }catch(Exception e) {
	    	
	    	e.printStackTrace();
	    }

	}

}
