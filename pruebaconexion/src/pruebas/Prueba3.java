package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class Prueba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/prueba1" + "?useUnicode=true"+ "&serverTimezone=UTC";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    
	    try {
		      
		      Class.forName(nombredriver);
		      Connection con = DriverManager.getConnection(url, "root", "root");
		      Statement stat=con.createStatement();
		       String sql = "select * from productos";
		            stat.execute(sql);
		            											//importante getmetadata para obtener metadatos del result
		            ResultSetMetaData rs = stat.executeQuery(sql).getMetaData();
		            
		            for(int i=1;i<rs.getColumnCount();i++) {
		            	System.out.println("Columnna:"+i);
		            	String name=rs.getColumnName(i);
		            	System.out.println("Nombre:"+name);
		            	String type=rs.getColumnTypeName(i);
		            	System.out.println("Tipo:"+type);
		            	int nulo=rs.isNullable(i);
		            	if(nulo==0) {
		            		System.out.println("Nulo:SI");
		            	}else {
		            		System.out.println("Nulo:NO");
		            	}
		            	int max=rs.getColumnDisplaySize(i);
		            	System.out.println("Maximo ancho de columna:"+max);
		            	System.out.println("--------------------------");
		            }
		            
	    }catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
