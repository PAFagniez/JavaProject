package com.towerdefense.hci;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private MainMenuPanel mainMenu;
	private LevelSelectionPanel levelSelectionMenu;
	private NameSelectionPanel nameSelectionPanel;
	private GamePanel gamePanel;

	public Frame (){
		buildNameSelectionPanel();

		build();
	}

	public void build(){
		setExtendedState(MAXIMIZED_BOTH);
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);
	}

	public void buildNameSelectionPanel(){
		this.nameSelectionPanel = new NameSelectionPanel(this, "res/matrice3.jpg");
		setContentPane(this.nameSelectionPanel);
	}

	public void buildMainMenu (){
		this.mainMenu = new MainMenuPanel(this, "res/matrice3.jpg");
		setContentPane(this.mainMenu);
	}

	public void buildLevelSelectionMenu (){
		this.levelSelectionMenu = new LevelSelectionPanel(this, "res/matrice3.jpg");
		setContentPane(this.levelSelectionMenu);
	}

	public void buildMap1(){
		this.gamePanel = new GamePanel(this);
		setContentPane(this.gamePanel);
	}

	public JPanel getMainMenu() {
		return this.mainMenu;
	}

	public JPanel getLevelSelectionMenu() {
		return this.levelSelectionMenu;
	}



}
