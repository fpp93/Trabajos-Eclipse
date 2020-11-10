package ejsueltos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.File.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String direccion ="src/ejsueltos/Empleados.dat";	
		String[] apellidos=new String[]{"ALONSO","RODRIGUEZ","OTERO","JIMENEZ","MEJIAS"};
		int[] departamentos=new int[] {10, 80, 40, 20, 10};
		double salarios[]=new double[] {4000.45, 2500.00, 1100.25, 1687.30, 6300.40};
		Scanner sc =new Scanner(System.in);
		Scanner scann =new Scanner(System.in);
		int cont=0;
		
		File f1 = new File(direccion);
	
		//objeto tipo gestroficherosbinarios
		GestorFicherosBinarios g1 = new GestorFicherosBinarios(f1);
		//menu switch case para elegir cada ejercicio pasandole los metodos en cada case
		do {
		System.out.println("Elige una opción");
		System.out.println("1:Escribir fichero");
		System.out.println("2:Leer fichero");
		System.out.println("3:Consultar datos");
		System.out.println("4:Insertar Empleado");
		System.out.println("5:Salir");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			g1.escribirDatos(apellidos, departamentos, salarios);
			break;
		case 2:
			g1.leerDatos();
			break;
		case 3:
			System.out.println("Introduzca id");
			int id=sc.nextInt();
			g1.consultarDatos(id);
			break;
		case 4:
			System.out.println("Introduzca id");
			int ide=sc.nextInt();
			System.out.println();
			System.out.println("introduzca apellido");
			String apellido=scann.nextLine();
			System.out.println();
			System.out.println("introduzca departamento");
			int dept=sc.nextInt();
			System.out.println();
			System.out.println("introduzca salario");
			double salario=sc.nextDouble();
			g1.InsertarDatos(ide, apellido, dept, salario);
			break;
		case 5:
			System.out.println("Hasta pronto");
			System.exit(0);
			break;
		}
		
		
		
		}while(cont==0);
		
		
		
		
		}

	}


