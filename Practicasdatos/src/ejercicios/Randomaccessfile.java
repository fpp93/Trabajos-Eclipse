package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Randomaccessfile {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String direccion ="C:/Users/Francisco/Desktop/accesodatos";
		
		String nombre = "ficheroAleatorio.dat";
		
		File f1 = new File(direccion,nombre);
		double[]numeros = {0.0,1.5,3.0,4.5,5.2};
		
		if(!f1.exists()) {
		
			try {													//rw significa lectura y escritura
				RandomAccessFile random = new RandomAccessFile(f1,"w");
				
				for(Double s:numeros) {
					random.writeDouble(s);
				}
				
				
				random.close();
				
				
			}catch(IOException e) {
				
				e.printStackTrace();
				
			}
			
		}else {
			try {
				RandomAccessFile random2 = new RandomAccessFile(f1,"r");
				
				while(random2.getFilePointer()<random2.length()) {
					System.out.println("valor:"+random2.readDouble());
					
					
				}
				random2.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
		}
		

	}

}
