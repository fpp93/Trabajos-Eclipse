package EjemploSemaforos;

public class Paciente extends Thread {

	private int identif;
	private Consulta Consulta;

	public Paciente(int identif, Consulta Consulta) {
		this.identif = identif;
		this.Consulta = Consulta;
	}

	public void run() {
		Consulta.nuevoPaciente(identif);
	}
	
}
