package HilosInterfaz;

import HilosHerencia.HilosEjemplo;

public class Main_hilos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		HilosEjemplo hilo1= new HilosEjemplo();
		hilo1.setName("pepe");
		HilosEjemplo hilo2= new HilosEjemplo();
		hilo2.setName("juan");
		HilosEjemplo hilo3= new HilosEjemplo();
		hilo3.setName("josefa");
		
		
		//System.out.println("Inicio de la carrera");
		
		hilo1.start();
		hilo1.join();
		hilo2.start();
		hilo2.join();
		hilo3.start();
		//System.out.println("Fin de la carrera");

	}

}
