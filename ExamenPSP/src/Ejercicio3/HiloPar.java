package Ejercicio3;

public class HiloPar extends Thread {
	
	
	
	
	
	
	public HiloPar() {
		
	
	}
	
	int sumapar =0;
	int par=0;
	public synchronized void run() {
		
		for(int i=0;i<=6;i++) {
			 par=(int)(Math.random()*20+1);
			if(par%2!=0) {
				par++;
				
			}
			System.out.println(this.getName()+":Ha generado el numero:"+par);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sumapar=sumapar+par;
		}
		System.out.println(this.getName()+":la suma de los numeros es:"+sumapar);
		
	}
	

}
