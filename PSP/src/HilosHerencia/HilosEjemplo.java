package HilosHerencia;

public class HilosEjemplo extends Thread {
	
	
	public void Thread(String nombre){
		
		
	}
	
	
	public void run() {
		
		
		System.out.println(getName());
		for(int i = 0; i<=10;i++) {
			
			if(i==5) {
				
			}
			System.out.print("X");
			
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		
	}


	public static HilosEjemplo crearEIniciar(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
