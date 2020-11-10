package ejsueltos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String direccion ="src/ejsueltos/quijote.txt";	
		
		
		File f1 = new File(direccion);
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(f1));
			
			String linea;
			int a = 0;
			
			
			while((linea = br.readLine()) != null) {
			
				for(int i = 0;i <linea.length();i++) {
					
					if(i==0) {
						
						if(linea.charAt(i)!=' ') {
							a++;
						}
                            
					}else {
						
						if(linea.charAt(i-1)==' ') {
							
							if(linea.charAt(i)!=' ') {
								a++;
							}      
						}	
                            
					}
				}
			}
				
				
			
			
			System.out.println("\nEL archivo contiene "+a+" palabras");
            br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
