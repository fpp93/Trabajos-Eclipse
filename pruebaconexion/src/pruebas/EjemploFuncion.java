package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.CallableStatement;

public class EjemploFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url = "jdbc:mysql://localhost:3306/prueba1" + "?useUnicode=true"+ "&serverTimezone=Europe/Madrid";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    
	    String preparedCall = "{? = call get_categoria (?)}";
	    try {
	    	
	    	
	    	Class.forName(nombredriver);
		      Connection con = DriverManager.getConnection(url, "root", "root");
		      CallableStatement cs = (CallableStatement) con.prepareCall(preparedCall);
		      
		      cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		      cs.setString(2,"Fruta");
		     
		      //executequery devuelve un resultset
		      ResultSet rs = cs.executeQuery();
		      
		      while(rs.next()) {
		    	  
		    	  System.out.println(rs.getString(1));
		    	  
		      }
		      
		      rs.close();
		      cs.close();
		      con.close();
		      
		      
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }

	}

}
