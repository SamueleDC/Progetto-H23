package it.unipv.ingsfw.model;

public class Paziente implements Runnable {
	private Distributore dis;
	private int numeroPaziente;
	public Paziente(Distributore d) {
		this.dis = d;

	}

	@Override
	public void run() {
		numeroPaziente = dis.ritiraNumero();
		System.out.println("Paziente " + Thread.currentThread().getId() + " " + "Ho preso il numero " + numeroPaziente);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dis.attendiTurno(numeroPaziente);
		System.out.println("Paziente " + Thread.currentThread().getId() + " " + "Entro dal dottore");

	}

}
