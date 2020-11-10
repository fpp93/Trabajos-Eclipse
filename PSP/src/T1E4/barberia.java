package T1E4;

	public class barberia {

		private int SillasEspera;
		private int SillasEsperaOcupadas=0;
		private boolean sillaBarberoOcupada=false;
		private boolean finCorte = false;
		private boolean barberoDormido=false;
		
		public barberia(int SillasEspera) {
			this.SillasEspera=SillasEspera;
		}
		
		//con un identificador, van entrando los diferentes clientes en este metodo y devuelve un boolean que sera si le ha cortado el pelo o no
		public synchronized boolean entrar(int clienteId) throws InterruptedException{
			
			if(SillasEsperaOcupadas==SillasEspera) {
				//si no hay sillas libres me voy sin cortarme el pelo
				
				System.out.println(">-El cliente "+clienteId+ " Se va enfadado");
				return false;
				
			}else {
				//me quedo esperando si la silla del barbero esta ocupada
				SillasEsperaOcupadas++;
				System.out.println(">-El cliente "+ clienteId+ " se sienta en la silla de espera");
				while(sillaBarberoOcupada==true) {
					//el hilo queda en cola
					wait();
				}

				// Desocupo la silla de espera
				SillasEsperaOcupadas--;

				// Me siento en la silla del barbero
				sillaBarberoOcupada = true;
				finCorte = false;

				// Si el barbero está dormido le despierto
				if (barberoDormido) {
					System.out.println(">- El cliente " + clienteId
							+ " despierta al barbero");
					//llamada de entrada a los hilos
					notifyAll();
				}

				// Espero a que me corte el pelo
				System.out.println(">- El cliente " + clienteId
						+ " se está cortando el pelo");
				while (!finCorte) {
					wait();
				}

				sillaBarberoOcupada=false;
				
				//pasa el siguiente
				notifyAll();
				
				System.out.println(">-El cliente "+ clienteId+ " se va satisfecho");
				
				return true;
			}
		}
		
		//metodo que ejecuta el "barbero" mientras está parado hasta que llega un cliente
		public synchronized void esperarCliente()throws InterruptedException{
			//el barbero espera a que llegue un cliente
			barberoDormido=true;
			
			while(sillaBarberoOcupada=false) {
				System.out.println(">>-El barbero está descansando");
				wait();
			}
			barberoDormido=false;
			System.out.println(">>-El barbero está cortando el pelo");
		}
		
		public synchronized void acabarCorte() {
			finCorte=true;
			System.out.println(">>-El barbero termina de cortar");
			notifyAll();
		}
				
	}


