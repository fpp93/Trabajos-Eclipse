package HilosInterfaz;

import java.io.IOException;

public class HilosEjemplo implements Runnable {
	
	Thread hilo;
	boolean suspender;
	boolean pausar;
	
	 HilosEjemplo (String nombre){
	        hilo=new Thread(this,nombre);
	        suspender=false;
	        pausar=false;
	    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			//for(int i = 0; i<=10;i++) {
				//System.out.print(Thread.currentThread().getName()+" "+ "-");
				
				//}
		System.out.println(Thread.currentThread().getName()+":"+"Despertarse");
		System.out.println(Thread.currentThread().getName()+":"+"Ducharse");
		System.out.println(Thread.currentThread().getName()+":"+"Desayunar");
		System.out.println(Thread.currentThread().getName()+":"+"Trabajar");
			
	}
	
	//Pausar el hilo
    synchronized void pausarhilo(){
        pausar=true;
        //lo siguiente garantiza que un hilo suspendido puede detenerse.
        suspender=false;
        notify();
    }
	}

	
	

