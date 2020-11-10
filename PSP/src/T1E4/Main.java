package T1E4;

public class Main {

	//metodo main en el que comienzo la ejecucion con "start" y le paso cuantos clientes tendra y cuantas sillas, siendo
	//modificable como quiera
	
	//comentario para Ramón:El codigo oroginal no es mio, llevo varios dias leyendolo, modificandolo a mi gusto y escrito
	//de cero completamente por mi hasta que al fin lo entendi 100%.
	public static void main(String[] args) {
		 int Sillas=4;
		 int Clientes=10;
		 
		 barberia b = new barberia(Sillas);
		 barbero pepe= new barbero(b);
		 cliente[] clientes = new cliente[10];
		 
		 pepe.start();
		 
		 for (int i=0;i<Clientes;i++) {
			 clientes[i]= new cliente(b,i);
			 clientes[i].start();
		 }
	}
}
