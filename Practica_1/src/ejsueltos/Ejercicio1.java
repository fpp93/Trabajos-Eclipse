package ejsueltos;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String direccion ="src/ejsueltos/nombres.txt";	
		
		
		File f1 = new File(direccion);
		
		Scanner sc = new Scanner(System.in);
		int cont=0;
		
		try {
	
			BufferedWriter wr = new BufferedWriter(new FileWriter(f1));
		do {
			
			System.out.println("Escribe nombres hasta que escribas SALIR");
			String option = sc.nextLine();
			
			if(option.equalsIgnoreCase("salir")){
				cont++;
				
				
			}else {
				char letra=' ';
				char[] vocales = option.toCharArray();
				
				for(int i=0;i<vocales.length;i++) {
					letra=vocales[i];
					if(vocales[i]=='a'  || vocales[i]=='e' || vocales[i]=='i' || vocales[i]=='o'||
							vocales[i]=='u') {
						vocales[i]='.';
						
						 letra=vocales[i];
					}
					wr.write(letra);
					
				}
				wr.write("\n");
					
					
			}
			
					
			
			
		}while(cont==0);
		
		wr.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
