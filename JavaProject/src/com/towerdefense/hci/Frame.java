package com.towerdefense.hci;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private final Panel contentPane;

	public Frame (){
		this.contentPane = new Panel();
		this.contentPane.setBackground(Color.BLACK);
		this.contentPane.setLayout(new BorderLayout());


		setSize(750, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(this.contentPane);
	}
}
