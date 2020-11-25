package T1E5;

public class Main {

    public static void main(String[] args) 
    {
    	
    	//instancio los hilos y el supermercado(variable que llevan los ocnstructores de los hilos)
         Supermercado supermercado = new Supermercado();
         
         Agricultor h1 =new Agricultor(supermercado);
         Thread agricultor=new Thread(h1);
         agricultor.setName("Eustaquio");
         
         Consumidor h2 =new Consumidor(supermercado);
         Thread consumidor=new Thread(h2);
         consumidor.setName("Charo");
         
        //llamada al metodo run de ambos hilos(sincronizados por la clase supermercado)
        consumidor.start(); 
        agricultor.start();
        
       
        
         
       
    }    

}
