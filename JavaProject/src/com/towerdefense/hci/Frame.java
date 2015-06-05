package com.towerdefense.hci;

import javax.swing.JFrame;

public class Frame extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private static int HEIGHT = 550;
	private static int WIDTH = 800;

	private final MainPanel contentPane;


	public Frame (){
		this.contentPane = new MainPanel();


		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(this.contentPane);
		setResizable(true);
		setLocationRelativeTo(null);
	}

}
