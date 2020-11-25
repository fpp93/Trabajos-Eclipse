package T1E5;



public class Consumidor implements Runnable{

	
	  private  Supermercado supermercado;
	  
	//no uso al final el semaforo pero lo dejo para futuras consultas
	  //private Semaphore semaforo=new Semaphore(1);
	    
	     // Constructor de la clase
	     
	    public Consumidor(Supermercado supermercado) 
	    {
	        this.supermercado = supermercado;
	    }
	 
	    @Override
	    
	     //ejecucion del hilo
	     
	    public void run() 
	    {
	    	
	        while(true)
	        {
					//semaforo.acquire();
					//llamada al metodo de supermercado(sincronizado)
		            System.out.println(Thread.currentThread().getName() + " consume: " + supermercado.consumir());
		            try {
			            Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            //semaforo.release();
		           
	        }
	    }
}
