package it.unipv.ingsfw.model;

public class Dottore implements Runnable {
	Distributore dis;
	
	public Dottore(Distributore d) {
		this.dis = d;
	}
	@Override
	public void run() {
		
		while(true) {
			System.out.println("Attendo paziente");
			dis.controllaPaziente();
			System.out.println("Servo il paziente con il numero " + dis.getNumeroServito());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

