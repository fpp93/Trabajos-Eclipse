package EjemplosRamon;

public class Calculadora extends Thread {
	
	int n1;
	int n2;
	
	public Calculadora(int n1, int n2, String nombre) 
	{
		super(nombre);
		this.n1=n1;
		this.n2=n2;
	}
	
	public void run() 
	{
		
		int i;
		
		if(this.getName().equalsIgnoreCase("Suma")) 
		{
			for(int x=1 ; x<=10 ; x++) 
			{
				i=n1+n2;
				
				System.out.println(this.getName()+" -> "+i);
			}
		}
		
		if(this.getName().equalsIgnoreCase("Multiplicacion")) 
		{
			for(int x=1 ; x<=10 ; x++) 
			{
				i=n1*n2;
				System.out.println(this.getName()+" -> "+i);
			}
		}
		
		if(this.getName().equalsIgnoreCase("Potencia")) 
		{
			for(int x=1 ; x<=10 ; x++) 
			{
				i=(int) Math.pow(n1,n2);
				System.out.println(this.getName()+" -> "+i);
			}
		}
		
		System.out.println("Fin del hilo "+this.getName());
	}

}
