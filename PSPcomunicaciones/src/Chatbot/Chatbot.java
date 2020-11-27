package Chatbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chatbot extends JFrame {
	
	private JTextArea chat_area =new JTextArea();
	private JTextField chat_enviar =new JTextField();

	public Chatbot() {
		JFrame interfaz = new JFrame();
		interfaz.setDefaultCloseOperation(EXIT_ON_CLOSE);
		interfaz.setVisible(true);
		interfaz.setResizable(false);
		interfaz.setLayout(null);
		interfaz.setSize(500,500);
		interfaz.setTitle("BOTellin");
		interfaz.add(chat_area);
		interfaz.add(chat_enviar);
		
		chat_area.setSize(450,300);
		chat_area.setLocation(2, 2);
		
		chat_enviar.setSize(450,30);
		chat_enviar.setLocation(2, 400);
		
		chat_enviar.addActionListener(new ActionListener() {
			int cont=0;
			int aleatorio1=(int)(Math.random()*3+1);

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				String texto=chat_enviar.getText();
				chat_area.append("YO->"+ texto + "\n");
				chat_enviar.setText("");
				
				if(texto.contains("hola")) {
					Responder("hola");
					cont++;
					
					
				}else if(texto.contains("buenas")) {
					Responder("Muy buenas");
					cont++;
				}else {
					if(cont==0) {
						Responder("Se saluda eeh");
						cont++;
					}
					
				}
				
				if(texto.contains("que tal")||texto.contains("como estas")||texto.contains("como te va")) {
					if(aleatorio1==1) {
						Responder("muy bien y tu? ;)");
						cont++;
						
					}
					if(aleatorio1==2) {
						Responder("ahi voy tirando..");
						Responder("que tal tu..");
						cont++;
					}
					if(aleatorio1==3) {
						Responder("tss fatal, y tu?");
						cont++;
					}
					
				}
				if(texto.contains("y eso")||texto.contains("que te pasa")||texto.contains("que te ha pasado")) {
					Responder("nah, cambiemos de tema");
					cont++;
				}
				if(texto.contains("bien")) {
					Responder("Me alegro por ti!");
					cont++;
				}
				if(texto.contains("mal")) {
					Responder("que te pasa??");
					cont++;
				}
				
				if(cont==5) {
					Responder("Quieres saber algo?");
				}
				
			}
			
			
			
			
		});
	}
	
	private void Responder(String respuesta) {
		chat_area.append("BOTellin->"+respuesta+ "\n");
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new Chatbot();

	}

}

