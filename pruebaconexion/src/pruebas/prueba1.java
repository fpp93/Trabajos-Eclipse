package pruebas;

import java.sql.*;

public class prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url = "jdbc:mysql://localhost:3306/prueba1" + "?useUnicode=true"+ "&serverTimezone=UTC";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    ResultSet rs = null;
	      
	    
	    try {
	      
	      Class.forName(nombredriver);
	      Connection con = DriverManager.getConnection(url, "root", "root");
	      Statement stat=con.createStatement();
	       String sql = "select * from productos";
	            stat.execute(sql);
	            
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
	        		 System.out.print("Precio:");
	        	 }
	        	 if(i==4) {
	        		 System.out.print("Categoria:");
	        	 }
	        	 System.out.print(result.getString(i)+ "\t");
	   	      
	        	 
	         }
	         
	         System.out.println(""); 
	        
	            }
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
}
