package it.unipv.ingsfw.view;

import java.awt.Color;
import java.awt.Font;


import javax.swing.JButton;


public class MyButton extends JButton {
	public Font customFont;
	public MyButton(String nome) {
		super(nome);
		setFont(new Font("Roman", Font.ROMAN_BASELINE, 25));
		setBackground(Color.GREEN);
		setForeground(Color.BLACK);
		setOpaque(true);
		

		setContentAreaFilled(true);


	}
}

