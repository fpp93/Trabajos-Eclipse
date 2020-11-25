package T1E5;



//en esta clase es donde controlo el orden de los hilos

public class Supermercado  { //clase que actuara de monitor
	
	private int coliflores;
    private boolean supermercadolleno = false;
 
    
     // con sinchronized controlo de forma concurrente el elemento que hay en el supermercado
     
    
    public synchronized int consumir()
    {
    	//en este metodo, si no hay producto, el hilo tendra que esperar(wait)
        while (!supermercadolleno)
        {
            try
            {
                wait();
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Supermercado vacio " );
            }
        }
        supermercadolleno = false;
        //una vez hay producto, notifico al hilo consumidor que puede seguir(notify)
        notify();
        //devuelvo la cantidad que coge el consumidor para luego llamar a este metodo en el run de su hilo
        return coliflores;
    }
 
    
    //numero aleatorio que devolvere(cantidad)
    public synchronized void reponer(int cantidad) 
    {
    	//metodo para que el agricultor ponga su producto, pasando la cantidad por parametro mientras la variable
    	//indique que el supermercado no esta lleno
        while (supermercadolleno) 
        {
            try
            {
                wait();
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Supermercado lleno");
            }
        }
      //devuelvo la cantidad que pone el consumidor para luego llamar a este metodo en el run de su hilo
        coliflores = cantidad;
        //no puedo poner mas productos, asi que notifico al consumidor que puede consumir(notify)
        supermercadolleno =true;
        notify();
    }
	
	
	

}
