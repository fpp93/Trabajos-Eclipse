package Semaforos;

import java.util.concurrent.Semaphore;

public class Variable {
	
	int i=0;

	public static void main(String[] args) {
		
		
		Variable ejemplo = new Variable();
		Semaphore semaphore = new Semaphore(1);
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				
				while(true) {
					try {
						
						semaphore.acquire();
						//adquirimos el control de la region critica(acceder a un recurso compartido)
						ejemplo.printSomething();
						
						Thread.sleep(1000);
						
						semaphore.release();
						//dejo el control de la region critica
						
					}catch(Exception e) {
						System.out.println("Interrupcion");
					}
				}
				
			}
			
		};
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}
	public void printSomething() {
		i++;
		System.out.println("El valor de i es: "+i);
	}

}
