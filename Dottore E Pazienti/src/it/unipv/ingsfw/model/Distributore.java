package it.unipv.ingsfw.model;

import java.awt.Color;

import it.unipv.ingsfw.view.ClinicaGUI;

public class Distributore {
	private int numeroAttesa;
	private int numeroServito;
	private ClinicaGUI cl;
	public Distributore(ClinicaGUI cl) {
		numeroAttesa = 0;
		numeroServito = 0; 
		this.cl = cl;
	}

	// dotttore che imposta il numero iniziale
	public void impostaInizio(int numero) {
		numeroAttesa = numero;
	}

	// cliente che ritira il numero
	public synchronized int ritiraNumero() {
		numeroAttesa++;
		cl.getPosto(numeroAttesa).setText("Posto occupato");
		cl.getPosto(numeroAttesa).setBackground(Color.RED);

		notifyAll();

		return numeroAttesa;
	}

	// cliente che aspetta nel caso in cui non sia il suo turno
	public synchronized void attendiTurno(int numero) {
		while(numeroAttesa!= numero) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		cl.getPosto(numeroAttesa).setText("Posto libero");
		cl.getPosto(numeroAttesa).setBackground(Color.GREEN);

	}

	// dottore che controlla se c'è un paziente in lista, altrimenti attende
	public synchronized void controllaPaziente() {
		while(numeroAttesa==numeroServito) {
			try {
				wait();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyAll();
		numeroServito++;
	}

	public int getNumeroServito() {
		return numeroServito;
	}

	public void setNumeroServito(int numeroServito) {
		this.numeroServito = numeroServito;
	}



}
