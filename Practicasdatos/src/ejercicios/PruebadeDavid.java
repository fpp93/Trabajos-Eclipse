package ejercicios;

import java.io.File;
import java.io.RandomAccessFile;

public class PruebadeDavid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nombres = {"Antonio","Emilio","Carlos","Pepe"};
		String nombreIntermedio;
		StringBuffer sb;
		
		try {
			
			File file = new File("lectura_aleatoria.dat");
			
			// si el fichero no existe, lo creamos y lo rellenamos con los datos de la tabla
			
			if (!file.exists()) {
				
				RandomAccessFile raf1 = new RandomAccessFile(file,"rw");
				
				for(int i = 0; i < nombres.length; i++) {
					
					sb = new StringBuffer(nombres[i]);
					sb.setLength(10); // longitud máxima de 10 bytes
					
					
					// cada registro: 4 bytes de int y 10 bytes de String
					
					raf1.writeInt(i);
					raf1.writeBytes(sb.toString());
					
				}
				
				raf1.close();
			}
			
			// Abrimos flujo de lectura
			
			RandomAccessFile raf = new RandomAccessFile(file, "r");
			
			System.out.println("Longitud total del fichero: " + raf.length()); 
			
			// imprimimos la longitud para comprobar que,
			// efectivamente, la longitud del archivo coincide con lo esperado
			
			byte[] buff = new byte[10]; // buffer de 10 bytes (tamaño del registro de String)
			
			System.out.println("--------------");
			System.out.println("Registros");
			System.out.println("--------------");
			
			// Lectura total del fichero
			// Utilizamos trim() para eliminar los espacios que hayamos introducido

			while(raf.getFilePointer()<raf.length()) {
				
				int i = raf.readInt();
				raf.read(buff);
				String s = new String(buff);
				System.out.println(i + " " + s.trim());
				
			}
			
			// Lecturas aleatorias
			
			System.out.println("--------------");
			System.out.println("Lecturas aleatorias");
			System.out.println("--------------");
			
			raf.seek(0);
			int i = raf.readInt();
			raf.read(buff);
			String s = new String(buff);
			System.out.println("Lectura del primer registro: " + i + " " + s.trim());
			
			// (i-1)*14; en nuestro caso -> 14*2 = leemos el tercer registro
			
			raf.seek(28);
			
			i = raf.readInt();
			
			raf.read(buff);
			s = new String(buff);
			System.out.println("Lectura del tercer registro: " + i + " " + s.trim());
			
			
			raf.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
