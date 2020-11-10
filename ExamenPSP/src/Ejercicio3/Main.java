package Ejercicio3;



public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		HiloImpar hiloimpar = new HiloImpar();
		hiloimpar.setName("HILO IMPAR");
		HiloPar hilopar = new HiloPar();
		hilopar.setName("HILO PAR");
		
		hiloimpar.start();
		hiloimpar.join();
		hilopar.start();

	}

}
