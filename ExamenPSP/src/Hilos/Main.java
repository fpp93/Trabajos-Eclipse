package Hilos;



public class Main {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		HilosEjemplo hilos1= new HilosEjemplo();
		hilos1.setName("Pepe");
		HilosEjemplo hilos2= new HilosEjemplo();
		hilos2.setName("Manolo");
		HilosEjemplo hilos3= new HilosEjemplo();
		hilos3.setName("Juan");
		
		
	
		hilos1.start();
		//hilos1.join();
	
		hilos2.start();
		//hilos2.join();
		hilos3.start();
		
		

	}

}
