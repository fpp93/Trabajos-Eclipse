package ejercicio7;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class EmisorUDP { 
  public static void main(String args [] ) { 
    // Comprueba los argumentos
    if (args.length != 2) { 
      System.err.println("Uso: java EmisorUDP maquina mensaje"); 
    } 
    else try{ 
      // Crea el socket 
      DatagramSocket sSocket = new DatagramSocket(); 
 
      // Construye la dirección del socket del receptor 
      InetAddress maquina = InetAddress.getByName(args[0]); 
      int puerto = 1800; 
 
      // Crea el mensaje
      byte [] cadena = args[1].getBytes(); 
      DatagramPacket mensaje = new DatagramPacket(cadena, cadena.length, maquina, puerto); //*****
 
      // Envía el mensaje 
      sSocket.send(mensaje); 
  
      // Cierra el socket 
      sSocket.close(); 
      
    } catch(UnknownHostException e) { 
      System.err.println("Desconocido: " + e.getMessage()); 
    } catch(SocketException e) { 
      System.err.println("Socket: " + e.getMessage()); 
    } catch(IOException e) { 
      System.err.println("E/S: " + e.getMessage()); 
    } 
  } 
}
