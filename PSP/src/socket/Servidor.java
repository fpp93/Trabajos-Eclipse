package socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import socket.Conexion;

public class Servidor extends Conexion //Se hereda de conexi�n para hacer uso de los sockets y dem�s
{
    public Servidor() throws IOException{super("servidor");} //Se usa el constructor para servidor de Conexion

    public void startServer()//M�todo para iniciar el servidor
    {
    	  Thread hilo = new Thread(new Runnable() {
              @Override
              public void run() {
        try
        {
            System.out.println("Esperando..."); //Esperando conexi�n

            cs = ss.accept(); //Accept comienza el socket y espera una conexi�n desde un cliente

            System.out.println("Cliente en l�nea");
            Scanner teclado = new Scanner(System.in);
          
            //Se obtiene el flujo de salida del cliente para enviarle mensajes
            salidaCliente = new DataOutputStream(cs.getOutputStream());
            salidaCliente.flush();
            
           
            //Se le env�a un mensaje al cliente usando su flujo de salida
          

            //Se obtiene el flujo entrante desde el cliente
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));

            while((mensajeServidor = entrada.readLine()) != null) //Mientras haya mensajes desde el cliente
            {
                //Se muestra por pantalla el mensaje recibido
            	String mensaje=teclado.nextLine();
                System.out.println(mensajeServidor);
                salidaCliente.writeUTF("servidor"+":"+mensaje+"\n");
                salidaCliente.flush();
                
            }

            System.out.println("Fin de la conexi�n");

            ss.close();//Se finaliza la conexi�n con el cliente
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    	  });
    	  hilo.start();
    }
}