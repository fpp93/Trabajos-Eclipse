package Hilos;



public class HilosEjemplo extends Thread {
	
	
	public void Thread(String nombre){
		
		
	}
	
	
	public void run() {
		
		
		System.out.println(getName());
		
		System.out.println(Thread.currentThread().getName()+":"+"Despertarse");
		System.out.println(Thread.currentThread().getName()+":"+"Ducharse");
		System.out.println(Thread.currentThread().getName()+":"+"Desayunar");
		System.out.println(Thread.currentThread().getName()+":"+"Trabajar");
			
			
		
		
		
	}


	public static HilosEjemplo crearEIniciar(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
