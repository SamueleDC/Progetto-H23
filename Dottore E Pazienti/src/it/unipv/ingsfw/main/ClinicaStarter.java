package it.unipv.ingsfw.main;

import it.unipv.ingsfw.model.Distributore;
import it.unipv.ingsfw.model.Dottore;
import it.unipv.ingsfw.model.Paziente;
import it.unipv.ingsfw.view.ClinicaGUI;

public class ClinicaStarter {
	public static final int N=10;
	public static void main(String[] args) {
		ClinicaGUI cl = new ClinicaGUI();
		Distributore dis = new Distributore(cl);
		//dis.impostaInizio(3);

		Dottore d = new Dottore(dis);
		Thread td = new Thread(d);
		td.start();

		for(int i=0;i<N;i++) {
			Paziente p = new Paziente(dis);
			Thread tp = new Thread(p);
			tp.start();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	}
}

