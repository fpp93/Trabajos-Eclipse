package Practica2;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejer4 {
	
	public static void insertarVentas(int idcli, int idprod) {
		
		String nombredriver ="com.mysql.cj.jdbc.Driver";
		
		    //numero aleatorio entre 1 y 40
	        int cantidad = (int) (Math.random()*40+1);
	        
		   //fecha del sistema
		     Date fechita=Date.valueOf(LocalDate.now());
		    
		     try {
		    	 Class.forName(nombredriver);
		    	 String url = "jdbc:mysql://localhost:3306/practica2" + "?useUnicode=true"+ "&serverTimezone=Europe/Madrid";
			       Connection con = DriverManager.getConnection(url, "prac2", "pass1234");
			       //sentencia de intert con placeholders y su preparedstatement
			      String sql = "INSERT INTO ventas(Fechaventa,IDcliente,IDproducto,Cantidad) values (?,?,?,?)";
			      PreparedStatement stat=con.prepareStatement(sql);
			      //seteo los datos de los palceholders
			      stat.setDate(1,fechita);
			      stat.setInt(2,idcli);
			      stat.setInt(3, idprod);
			      stat.setInt(4,cantidad);
			      
			      stat.executeUpdate();
		    }catch(Exception e) {
		    	
		    	e.printStackTrace();
		    }
		    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	    
	    for(int i=1;i<=10;i++) {
	    	insertarVentas(i,100+i);
	    }
	    	    

	}

}
