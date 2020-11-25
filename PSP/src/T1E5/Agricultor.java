package T1E5;

public class Agricultor implements Runnable {

    private  Supermercado supermercado;
    
    //no uso al final el semaforo pero lo dejo para futuras consultas
    //private Semaphore semaforo=new Semaphore(1);
 
    
    //Constructor que lleva el atributo tipo supermercado(esta clase es comun a los dos hilos)
     
    public Agricultor(Supermercado supermercado) 
    {
        this.supermercado = supermercado;
    }
 
    @Override
    
      //Implementación del hilo
     
    public void run() 
    {
    	
        while(true)
        {
        	//numero aleatorio que hace referencia al producto que pone el agricultor
            int poner =(int)(Math.random()*100+1);
            //metodo de supermercado(sinconizado)
           
				//semaforo.acquire();
				supermercado.reponer(poner);
	            System.out.println(Thread.currentThread().getName() + " deja: " + poner);
	            //semaforo.release();
	            try {
		            Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
        }
        
    }

	
}
