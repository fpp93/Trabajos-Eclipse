package socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import socket.Conexion;

public class Cliente extends Conexion
{
    public Cliente() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion

    public void startClient() //Método para iniciar el cliente
    {
    	Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
    	try
        {
          Scanner teclado = new Scanner(System.in);
          
          System.out.println("Introduzca su nombre:");
          
          String nombre_cliente = teclado.nextLine();
          
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());
            entradaservidor =new DataInputStream(cs.getInputStream());
            salidaServidor.flush();
            String recibida="";

            //Se enviarán tantos mensajes como uno quiera
            while(true)
            {
            	
            	
              String mensaje=teclado.nextLine();
              
              if(mensaje.equalsIgnoreCase("Salir")) 
              {
                //Se escribe en el servidor usando su flujo de datos
                    salidaServidor.writeUTF("El cliente ha cerrado la conexion.");
                    
                break;
              }
              else
              {
            	//Se escribe en el servidor usando su flujo de datos
                  salidaServidor.writeUTF(nombre_cliente + ": " + mensaje + "\n");
                  salidaServidor.flush();
            	  recibida=entradaservidor.readUTF();
              	  System.out.println(recibida);
              	  
                
                    
                    
              }
              
                
            }

            cs.close();//Fin de la conexión
            
            teclado.close();

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