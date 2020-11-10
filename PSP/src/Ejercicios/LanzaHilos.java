package Ejercicios;

public class LanzaHilos extends Thread{

	//Para lanzar un hilo lo hacemos desde objetos heredados de la clase Thread
		
	private int id;
	
	//constructor
	public LanzaHilos (int id) {
		this.id=id;
	}
		
	
	public void run() {
		System.out.println("Soy el Hilo "+id);
		//aqu� va el c�digo que tengo que ejecutar al lanzar los Hilos
	}
	
	
	public static void main (String[] args) {
	
	LanzaHilos h1 = new LanzaHilos(1);
	//el identificador del hilo es el 1
	
	LanzaHilos h2 = new LanzaHilos(2);
	LanzaHilos h3 = new LanzaHilos(3);
	LanzaHilos h4 = new LanzaHilos(4);
		
	//para lanzar un hilo nuevo
	h1.start();
	
	System.out.println("Hola soy el Hilo Principal, ya que estoy en el Main");
	//Esta sentencia se ejecutar� a la vez que el Hilo 1, pero es del hilo principal
	//Los hilos ejecutar�n lo que se encuentra en el m�todo Run
	
	h2.start();

	System.out.println("Hola soy el Hilo Principal, ya que estoy en el Main");
	
	h3.start();
	
	System.out.println("Hola soy el Hilo Principal, ya que estoy en el Main");
	
	h4.start();
	
	System.out.println("Hola soy el Hilo Principal, ya que estoy en el Main");
	
	}
	
	
}
