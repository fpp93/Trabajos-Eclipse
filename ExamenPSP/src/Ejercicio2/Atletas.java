package Ejercicio2;

public class Atletas extends Thread {
	
	
	
	public  Atletas(){
		
		
	}
	
	
	

	int velocidad;
	int cont1=0;
	int cont2=0;
	int cont3=0;
	
	public void run() {
		
		
		System.out.println(getName());
		
		if(this.getName().equalsIgnoreCase("Greene")) {
			velocidad=(int)(Math.random()*10+1);
			for(int i = 0; i<=velocidad;i++) {
				
				
				System.out.print("-");
				cont1++;
				
				try {
					Thread.sleep(1000);
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
		if(this.getName().equalsIgnoreCase("Johnson")) {
			velocidad=(int)(Math.random()*10+1);
			for(int i = 0; i<=velocidad;i++) {
				
				
				System.out.print("-");
				cont2++;
				
				try {
					Thread.sleep(1000);
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
		if(this.getName().equalsIgnoreCase("Bolt")) {
			velocidad=(int)(Math.random()*10+1);
			for(int i = 0; i<=velocidad;i++) {
				
				
				System.out.print("-");
				cont3++;
				
				try {
					Thread.sleep(1000);
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
		
		if(cont1<cont2 && cont1<cont3) {
			System.out.println("Greene ha ganado la carrera");
		}
		if(cont2<cont1 && cont2<cont3) {
			System.out.println("Johnson ha ganado la carrera");
		}
		if(cont3<cont2 && cont3<cont2) {
			System.out.println("Greene ha ganado la carrera");
		}
		if(cont1==cont2 && cont1==cont3) {
			System.out.println("Empate de tres");
		}
		if(cont1==cont2 && cont1!=cont3) {
			System.out.println("Empate de dos");
		}
		if(cont1==cont3 && cont1!=cont2) {
			System.out.println("Empate de dos");
		}
	}

}
