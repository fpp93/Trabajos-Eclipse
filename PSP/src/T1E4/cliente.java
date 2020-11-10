package T1E4;

public class cliente extends java.lang.Thread {

	//atributo de tipo barberia para poder utilizar sus metodos
	
	private barberia b;
	private int id;
	private boolean cortePelo = false;
	
	//constructor
	public cliente(barberia b,int id) {
		this.b=b;
		this.id=id;
	}

//ejecucion de los hilos en bucle infinito
public void run () {
	//bucle infinito
	
	while(true) {
		try {
			Thread.sleep(2000);
			//si no tiene el pelo cortado, utilizo el metodo entrar de barberia
			//para que el cliente entre y pueda "cortarse el pelo"
			cortePelo=b.entrar(id);
			//cortar pelo
			if(cortePelo=true) {
				//tiempo de espera simulando el corte de pelo
				Thread.sleep(25000);
			}else {
				//segundo intento para entrar
				Thread.sleep(4000);
			}
			
		}catch(InterruptedException e) {
			
		}
	}
}
}