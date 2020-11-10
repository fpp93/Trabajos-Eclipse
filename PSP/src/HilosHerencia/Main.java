package HilosHerencia;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		HilosEjemplo hilos1= new HilosEjemplo();
		hilos1.setName("Pepe");
		HilosEjemplo hilos2= new HilosEjemplo();
		hilos2.setName("Manolo");
		HilosEjemplo hilos3= new HilosEjemplo();
		hilos3.setName("Juan");
		
		
		System.out.println("Inicio de la carrera");
		//hilo1.start();
		
		//hilo2.start();
		
		//hilo3.start();
		
		System.out.println("Fin de la carrera");
		

	}

}
