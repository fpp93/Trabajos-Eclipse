package EjemplosRamon;

public class Main {

	public static void main(String[] args) {
		
		Calculadora h1 = new Calculadora(1,2,"Suma");
		Calculadora h2 = new Calculadora(1,2,"Multiplicacion");
		Calculadora h3 = new Calculadora(1,2,"Potencia");
		
		h1.start();
		
		try {
			h1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		h2.start();
		h3.start();

	}

}
