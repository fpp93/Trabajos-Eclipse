package Ejercicio2;



public class Main {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		 
		 
		
		
		Atletas hilo1= new Atletas();
		hilo1.setName("Greene");
		
		Atletas hilo2= new Atletas();
		hilo2.setName("Johnson");
		
		Atletas hilo3= new Atletas();
		hilo3.setName("Bolt");
		
		
		System.out.println("Inicio de la carrera");
		hilo1.start();
		hilo1.join();
		hilo2.start();
		hilo2.join();
		hilo3.start();
		
		System.out.println("Fin de la carrera");

	}

}
