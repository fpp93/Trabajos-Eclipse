package ejercicios_XML;

import java.io.File;
import java.util.Scanner;





public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fil = new File("res/registro.xml");	
		
		GestorFruteria f1 = new GestorFruteria(fil);
		
		//no podia limbiar el buffer bien , por eso he creado tres scanners
		Scanner sc =new Scanner(System.in);
		Scanner scan =new Scanner(System.in);
		Scanner sca =new Scanner(System.in);
		int cont=0;
		
		
		//menu para mostrar todos los metodos
		do {
			System.out.println("Elige una opción");
			System.out.println("1:Modificar precio");
			System.out.println("2:Borrar Articulo");
			System.out.println("3:Mostrar xml");
			System.out.println("4:Salir");
			int option = sc.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Introduce el nombre del articulo");
				String articulo=scan.nextLine();
				
				System.out.println("Introduce el nuevo precio");
				
				float nuevoPrecio=sc.nextInt();
				
				f1.modificarPrecio(articulo,nuevoPrecio);
				break;
			case 2:
				System.out.println("Que articulo quieres borrar");
				String borrar =sca.nextLine();
				f1.fueraDeStock(borrar);
				break;
			case 3:
				f1.mostrarArticulos();
				break;
			case 4:
				System.out.println("Hasta pronto");
				System.exit(0);
				break;
			default:
				System.out.println("opcion no valida");
			}
			
			
			
			}while(cont==0);
		
	}

}
