package ejsueltos;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.InputMismatchException;

public class GestorFicherosBinarios {
	
	private File f1;
	
	//constructor con el file por parametro
	public GestorFicherosBinarios(File f1) {
		
		this.f1=f1;
		
	}
	
	
	public File getF1() {
		return f1;
	}

	public void setF1(File f1) {
		this.f1 = f1;
	}

	//un metodo para cada ejercicio
	public void escribirDatos(String[]apellidos,int departamentos[],double[] salarios) {
		
try {
			
			int id=0;
			RandomAccessFile random = new RandomAccessFile(f1, "rw");
			
			
			for(int i=0;i<apellidos.length;i++) {
				id++;
				//escribo los 10 espacios
				while(apellidos[i].length()<10) {
					
					apellidos[i]=apellidos[i]+" ";
				}
				//los escribo en el file
				random.writeInt(id);
				random.writeBytes(apellidos[i]);
				random.writeInt(departamentos[i]);
				random.writeDouble(salarios[i]);
			}
			
			
			//cierro flujo
			random.close();
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void leerDatos() {
		
		
		
		try {
			
			//flujo de lectura
			RandomAccessFile random = new RandomAccessFile(f1, "r");
			
		
		
		while(random.getFilePointer()<random.length()) {
			try {
				//array de bytes 
				byte[]b=new byte[10];
				System.out.print("Id:"+random.readInt()+",");
				//leo los bytes y los guardo en un string
				random.read(b);
				String s=new String(b);
				//escribo ese string sin espacios con.trim
				System.out.print("Apellido:"+s.trim()+",");
				System.out.print("Departamento:"+random.readInt()+",");
				System.out.print("Salario:"+random.readDouble()+"\n");
				
				
			}catch(EOFException e) {
				break;
			}
		}
		random.close();	
		
	}catch(FileNotFoundException e ) {
			e.printStackTrace();
			
			
	}catch(IOException e) {
		
		e.printStackTrace();
	}
		
	}
	public void consultarDatos(int id) {
		
try {
			
			RandomAccessFile random = new RandomAccessFile(f1, "rw");
			byte[]b=new byte[10];
		
			
		int posicion=26*(id-1);
		//situo el puntero en lo que vale cada registro multiplicado por el id que le paso -1
		random.seek(posicion);
			
		//leo todo dus datos igual que en el ejercicio anterior
		System.out.print("Id:"+random.readInt()+",");
		random.read(b);
		String s=new String(b);
		System.out.print("Apellido:"+s.trim()+",");
		System.out.print("Departamento:"+random.readInt()+",");
		System.out.print("Salario:"+random.readDouble());
		System.out.println();
		random.close();
		
	}catch(EOFException e) {
			e.printStackTrace();
			
	}catch(IOException e) {
		
		e.printStackTrace();
	}
		
	}
	public void InsertarDatos(int id,String apellido,int departamento,double salario) {
		
		int cont=0;
		try {
			
			RandomAccessFile random = new RandomAccessFile(f1, "rw");
			
			//me situo en ese id, y si ya existe no me deja introducirlo
			random.seek(26*(id-1));
				try {
					if(random.readInt()==id) {
						System.out.println("Ese id ya existe");
						cont++;
					}
				}catch(EOFException e) {
					e.printStackTrace();
				}
				
				//si no existe(cont==0) entra y lo inserta
			if(cont==0) {
				try {
			
				random.seek(f1.length());
				random.writeInt(id);
				while(apellido.length()<10) {
					apellido=apellido+" ";
				}
				random.writeBytes(apellido);
				random.writeInt(departamento);
				random.writeDouble(salario);
				System.out.println("Inserción realizada");
			
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}
			}
	
	random.close();
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	 
	}
}
	
