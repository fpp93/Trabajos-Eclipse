package ejercicio7;
import java.net.*; 
import java.io.*; 
 
public class ReceptorUDP { 
  public static void main(String args [] ) { 
    // Sin argumentos 
    if (args.length != 0) { 
      System.err.println("Uso: java ReceptorUDP"); 
    }else try{ 
      // Crea el  socket 
      DatagramSocket sSocket = new DatagramSocket(1800); 
 
      // Crea el espacio para los mensajes 
      byte [] cadena = new byte[1000] ; 
      DatagramPacket mensaje = new DatagramPacket(cadena, cadena.length); 
 
      System.out.println("Esperando mensajes..");
      while(true){
        // Recibe y muestra el mensaje 
           sSocket.receive(mensaje); 
           String datos = new String(mensaje.getData(), 0, mensaje.getLength());
           System.out.println("	Mensaje Recibido: " + datos);
           System.out.println("");
        //Programa que cuenta las palabras
           int contA=0, contE=0, contI=0, contO=0, contU=0;
           char[] frase = datos.toCharArray();
		           
            for(int i=0; i<frase.length; i++) {
		switch(frase[i]) {
                    case 'a': case 'A':{
                        contA++;
		        break;
		    }//Fin Case
                    case 'e': case 'E':{
		        contE++;
		        break;
		    }//Fin Case
		    case 'i': case 'I':{
		        contI++;
		        break;
		    }//Fin Case
		    case 'o': case 'O':{
		        contO++;
		        break;
		    }//Fin Case
		    case 'u': case 'U':{
		        contU++;
		        break;
		    }//Fin Case        	   
		}//end switch
            }//end for
    System.out.println("\t[A:"+contA+"] - [E:"+contE+"] - [I:"+contI+"] - [O:"+contO+"] - [U:"+contU+"]");
           
      }
    } catch(SocketException e) { 
      System.err.println("Socket: " + e.getMessage()); 
    } catch(IOException e) { 
      System.err.println("E/S: " + e.getMessage()); } 
    } 
}

