package Ejercicio1;

public class Cocina extends Thread {
	
	
	public Cocina() {
		
	}

	int clientes=(int)(Math.random()*1+5);
	public  void run() {
		
		for(int i=0;i<clientes;i++) {
			System.out.println("Entra un nuevo cliente");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int preparacion=(int)(Math.random()*1+5);
			for(int x=0;x<preparacion;x++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(this.getName()+":Preparando plato...");
			}
			System.out.println("cliente despachado");
			this.stop();
		}
		
		
		
		
	}
}
