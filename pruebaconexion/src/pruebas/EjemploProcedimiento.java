package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.CallableStatement;

public class EjemploProcedimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/prueba1" + "?useUnicode=true"+ "&serverTimezone=Europe/Madrid";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    
	    String preparedCall = "{call subida_precio (?,?)}";
	    try {
	    	
	    	
	    	Class.forName(nombredriver);
		      Connection con = DriverManager.getConnection(url, "root", "root");
		      CallableStatement cs = (CallableStatement) con.prepareCall(preparedCall);
		      cs.setInt(1,4);
		      cs.setFloat(2,2);
		      cs.execute();
		      
		      System.out.println("filas actualizadas:"+ cs.getUpdateCount());
		      
		      
		      cs.close();
		      con.close();
		      
		      
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	    

	}

}
