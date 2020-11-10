package Practica2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url = "jdbc:mysql://localhost:3306/practica2" + "?useUnicode=true"+ "&serverTimezone=UTC";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    
	    try {
	    	Class.forName(nombredriver);
		      Connection con = DriverManager.getConnection(url, "prac2", "pass1234");
		      Statement stat=con.createStatement();
		      //llamada a mi funcion
		      String sql = "select practica2.CALC_BENEFICIO(4)";
		      ResultSet result = stat.executeQuery(sql);
		      
		      while(result.next()) {
		        	
			         for(int i=1;i<=result.getMetaData().getColumnCount();i++) {
			        	 if(i==1) {
			        		 System.out.print("Resultado:");
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
