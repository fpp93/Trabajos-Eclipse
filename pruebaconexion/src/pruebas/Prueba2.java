package pruebas;

import java.sql.*;

public class Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/prueba1" + "?useUnicode=true"+ "&serverTimezone=UTC";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    ResultSet rs = null;
	    int id=11;
	    String nombre="coco";
	    double precio=2.25;
	    int categoria=1;
	    try {
	    	
	    	Class.forName(nombredriver);
		      Connection con = DriverManager.getConnection(url, "root", "root");
		      Statement stat=con.createStatement();
		       String sql = ("insert into productos(nombre_producto,precio,categoria_id)values('"+nombre+"',"+precio+","+categoria+")");       
		       //String sql=("delete from productos where id=12");
		      stat.executeUpdate(sql);
		            
		            
		            
	    }catch(SQLException e) {
	    	e.printStackTrace();
	    	
	    	
	    }catch(ClassNotFoundException e) {
	    	
	    	e.printStackTrace();
	    }
		
	}

}
