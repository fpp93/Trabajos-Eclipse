package socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

import socket.Conexion;

public class Cliente extends Conexion
{
    public Cliente() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion

    public void startClient() //M�todo para iniciar el cliente
    {
    	try
        {
          Scanner teclado = new Scanner(System.in);
          
          System.out.println("Introduzca su nombre (este nombre ser� visible para todos los dem�s usuarios de la aplicaci�n):");
          
          String nombre_cliente = teclado.nextLine();
          
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());

            //Se enviar�n tantos mensajes como uno quiera
            while(true)
            {
              System.out.println("Introduzca mensaje:");
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
              }
              
                
            }

            cs.close();//Fin de la conexi�n
            
            teclado.close();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}