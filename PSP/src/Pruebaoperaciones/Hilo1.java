package Pruebaoperaciones;

public class Hilo1 extends Thread {
	
	
	int num1=10;
	int num2=20;
	
	public void run() {
		
		int result=0;
		
		
		
		while(result<=1000000) {
			
			result=result+(num1+num2);
		}
		
		System.out.println("fin del hilo2 "+result);
		
	}

}
