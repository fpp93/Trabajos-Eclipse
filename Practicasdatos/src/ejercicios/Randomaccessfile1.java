package ejercicios;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Randomaccessfile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String direccion ="C:/Users/Francisco/Desktop/accesodatos";
		
		String nombre = "ficheroAleatorio.dat";
		
		File f1 = new File(direccion,nombre);
		double[]numeros = {0.0,1.5,3.0,4.5,5.2};
		
		try {
			
			RandomAccessFile random = new RandomAccessFile(f1,"rw");
			
			//queremos escribir en la posicion 4, si sabemos que cada double son 8 bytes, habra que fijar la posicion
			//8*3=24;
			random.seek(24);
			random.writeDouble(3.14);
			
			random.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
