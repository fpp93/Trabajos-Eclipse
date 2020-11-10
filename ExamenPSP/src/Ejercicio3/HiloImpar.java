package Ejercicio3;

public class HiloImpar extends Thread {
	
	
	
	
	
	public HiloImpar() {
		
	
	}
	
	int sumaimpar=0;
	int impar=0;
	public synchronized void run() {
		
		for(int i=0;i<=6;i++) {
			 impar=(int)(Math.random()*20+1);
			if(impar%2==0) {
				impar++;
			}
			
			System.out.println(this.getName()+":Ha generado el numero:"+impar);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sumaimpar=sumaimpar+impar;
		}
		System.out.println(this.getName()+":la suma de los numeros es:"+sumaimpar);
		
		
		
	}
	
	

}
