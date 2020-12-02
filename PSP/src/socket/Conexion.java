package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Conexion
{
    private final int PUERTO = 1234; //Puerto para la conexión
    //private final String HOST = "192.168.1.132"; //Host para la conexión
    protected String mensajeServidor; //Mensajes entrantes (recibidos) en el servidor
    protected ServerSocket ss; //Socket del servidor
    protected Socket cs; //Socket del cliente
    protected DataOutputStream salidaServidor, salidaCliente; //Flujo de datos de salida
    protected DataInputStream entradaservidor,entradacliente;

    public Conexion(String tipo) throws IOException //Constructor
    {
    	
    	
        if(tipo.equalsIgnoreCase("servidor"))
        {
            ss = new ServerSocket(PUERTO);//Se crea el socket para el servidor en puerto 1234
            cs = new Socket(); //Socket para el cliente
        }
        else
        {
        	
        	String host=JOptionPane.showInputDialog("introduce el HOST");
            cs = new Socket(host, PUERTO); //Socket para el cliente en localhost en puerto 1234
        }
    }
}
