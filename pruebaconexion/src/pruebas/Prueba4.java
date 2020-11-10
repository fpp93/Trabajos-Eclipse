package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prueba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/prueba1" + "?useUnicode=true"+ "&serverTimezone=UTC";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    
	    try {
		      
		      Class.forName(nombredriver);
		      String sql = "select nombre_producto,precio from productos where id=?";
		      Connection con = DriverManager.getConnection(url, "root", "root");
		      PreparedStatement stat=con.prepareStatement(sql);
		      stat.setInt(1,1);
		      
		      ResultSet result = stat.executeQuery();
		      
		      result.next() ;
		    	  
		    	  System.out.println("nombre:"+result.getString(1));
		    	  System.out.println("precio:"+result.getFloat(2));
		      
		      
		            
		            
		            
	    }catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
