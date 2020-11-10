package ejercicios;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String direccion ="C:/Users/Francisco/Desktop/accesodatos";
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		String nombre = "nombres.txt";
		
		Scanner sc = new Scanner(System.in);
		
		File f1 = new File(direccion,nombre);
		
		try {
			int cont = 0;
			FileWriter escritura = new FileWriter(f1);
			
			do {
				System.out.println("Nombre,SALIR");
				
				String option= sc.nextLine();
				
				switch(option){
				
					case "SALIR":
						
						cont++;
						break;
						
					case "Nombre":
						System.out.println("introduce un nombre");
						String name = sc.nextLine();
						nombres.add(name);
						break;
						
				}
			}while(cont==0);
			
			char temp =' ';
			
			for(String s:nombres) {
				char[] vocales = s.toCharArray();
				
				for(int i=0;i<vocales.length;i++) {
					
					 temp=s.charAt(i);
					if(temp=='a'|| temp=='e'||temp=='i' ||temp=='o' || temp=='u') {
						
						vocales[i]='.';
						
						
					}
				}
				try {
					FileWriter out = new FileWriter(f1);
					
					String.copyValueOf(vocales);
					out.write(vocales+"\n");
					System.out.println(vocales);
					out.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
					
				
			}
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
