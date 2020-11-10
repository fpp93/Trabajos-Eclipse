package Practica2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejer3 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String direccion ="src/Practica2/datos.txt";
		File f1 = new File(direccion);
		
		
		String url = "jdbc:mysql://localhost:3306/practica2" + "?useUnicode=true"+ "&serverTimezone=UTC";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    
	    
	    
	    try {
	    	Class.forName(nombredriver);
		      Connection con = DriverManager.getConnection(url, "prac2", "pass1234");
		      //buffer de lectura para leer el archivo
	    	BufferedReader br = new BufferedReader(new FileReader(f1));
	    	
	    	//bucle infinito que cerrare cuando en archivo acabe o sea null
			while(true) {
				Statement stat=con.createStatement();
				//sentencia de lectura del archivo linea por linea
				String sql = (br.readLine());
				
				if(sql!=null) {
					//mientras no sea null, ejecuto la sql
					stat.executeUpdate(sql);
					
				}else {
					break;
				}
				
			}
			br.close();
			con.close();
	    	
	    }catch(Exception e) {
	    	
	    	e.printStackTrace();
	    }

	}

}
