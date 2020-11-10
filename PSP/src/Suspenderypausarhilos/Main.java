package Suspenderypausarhilos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiHilo mh1=MiHilo.crearEIniciar("Mi Hilo");
        try {
            Thread.sleep(1000);//dejar que el primer hilo comience a ejecutarse

            mh1.suspenderhilo();
            System.out.println("Suspendiendo Hilo.");
            Thread.sleep(1000);

            mh1.renaudarhilo();
            System.out.println("Renaudando Hilo.");
            Thread.sleep(1000);

            mh1.suspenderhilo();
            System.out.println("Suspendiendo Hilo.");
            Thread.sleep(1000);

            mh1.renaudarhilo();
            System.out.println("Renaudando Hilo.");
            Thread.sleep(1000);

            mh1.suspenderhilo();
            System.out.println("Pausando Hilo.");
            mh1.pausarhilo();
        }catch (InterruptedException e){
            System.out.println("Hilo principal interrumpido.");
        }

        //esperar a que el hilo termine
        try {
            mh1.hilo.join();
        }catch (InterruptedException e){
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
    }
}
	


