package Ejercicio1;



public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int cocineros=(int)(Math.random()*1+5);
		
		for(int i=0;i<cocineros;i++) {
			Cocina Ci = new Cocina();
			Ci.start();
			Ci.setName("Cocinero "+i);
			Ci.join();
		}
		
		

	}

}