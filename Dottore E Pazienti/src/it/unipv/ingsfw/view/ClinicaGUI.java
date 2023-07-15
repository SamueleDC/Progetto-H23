package it.unipv.ingsfw.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import it.unipv.ingsfw.main.ClinicaStarter;

public class ClinicaGUI {
	private JFrame frame;
	private JLabel screen;
	private MyButton[] posto;
	private MyButton inizio;
	private int height,width;


	public ClinicaGUI () {
		frame=new JFrame("Dottore e Pazienti");

		height = 1000;
		width =1000;
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p1 = new JPanel();
		Container c = frame.getContentPane();
		c.add(p1);
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(5,5,20,20));
		posto=new MyButton[ClinicaStarter.N+1];

		for(int i=1;i<ClinicaStarter.N+1;i++) {

			posto[i]=new MyButton("Posto libero");
			posto[i].setPreferredSize(new Dimension(200,50));

			p2.add(posto[i]);
		}
			inizio = new MyButton("Benvenuti alla clinica");
			inizio.setFont(new Font("Roman", Font.ROMAN_BASELINE, 30));
			inizio.setForeground(Color.MAGENTA);
			inizio.setBackground(Color.YELLOW);
			frame.setLayout (new BorderLayout(0,20));
			frame.add(p2, BorderLayout.CENTER);
			frame.add(inizio, BorderLayout.NORTH);
			frame.setVisible(true);
	}
			

	public JLabel getScreen() {
		return screen;
	}


	public void setScreen(JLabel screen) {
		this.screen = screen;
	}


	public MyButton getPosto(int num) {
		return posto[num];
	}


	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}


	public void setPosto(MyButton[] posto) {
		this.posto = posto;
	}


	public MyButton getInizio() {
		return inizio;
	}


	public void setInizio(MyButton start) {
		this.inizio = start;
	}
	
}





