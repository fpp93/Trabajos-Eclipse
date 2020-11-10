package T1E4;

public class barbero extends Thread {

	//atributo de tipo barberia
	private barberia b;

	public barbero(barberia b) {
		this.b=b;
	}
	
	public void run() {
		//bucle infinito
		while(true) {
			try {
				//metodos de la clase barberia para el barbero especificamente
				b.esperarCliente();
				//cortar pelo
				Thread.sleep(5000);
				b.acabarCorte();
				//descansa
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
