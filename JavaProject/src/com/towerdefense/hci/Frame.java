package com.towerdefense.hci;

import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.towerdefense.rcs.event.DisplayLevelSelectionPanel;
import com.towerdefense.rcs.event.DisplayMainMenu;
import com.towerdefense.rcs.event.ExitGame;

public class Frame extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private MainMenuPanel mainMenu;
	private LevelSelectionPanel levelSelectionMenu;
	private NameSelectionPanel nameSelectionPanel;

	private JButton buttonPlay;
	private JButton buttonLoad;
	private JButton buttonExit;

	private JButton buttonMap1;
	private JButton buttonMap2;
	private JButton buttonMap3;

	private JButton buttonValidate;
	private JButton buttonBack;

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

	public void buildMainMenu (){
		this.mainMenu = new MainMenuPanel("res/LaMatrice.jpg");
		setContentPane(this.mainMenu);
		this.buttonPlay = new JButton(new DisplayLevelSelectionPanel(this, "Play"));
		this.buttonPlay.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.buttonLoad = new JButton("Load");
		this.buttonLoad.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.buttonExit = new JButton(new ExitGame(this,"Exit"));
		this.buttonExit.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.add(this.buttonPlay, this.mainMenu.getGc());
		this.mainMenu.getGc().gridx = GridBagConstraints.REMAINDER;
		this.mainMenu.getGc().gridy = 3;

		this.add(this.buttonLoad, this.mainMenu.getGc());
		this.mainMenu.getGc().gridx = GridBagConstraints.REMAINDER;
		this.mainMenu.getGc().gridy = 4;

		this.add(this.buttonExit, this.mainMenu.getGc());
		this.mainMenu.getGc().gridx = GridBagConstraints.REMAINDER;
		this.mainMenu.getGc().gridy = GridBagConstraints.REMAINDER;
	}

	public void buildLevelSelectionMenu (){
		this.levelSelectionMenu = new LevelSelectionPanel("res/LaMatrice.jpg");
		setContentPane(this.levelSelectionMenu);
		this.buttonMap1 = new JButton("  MotherBoard Attack  ");
		this.buttonMap1.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.buttonMap2 = new JButton("Hard Drive Disk Attack");
		this.buttonMap2.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.buttonMap3 = new JButton("       Bios Attack      ");
		this.buttonMap3.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.buttonBack = new JButton(new DisplayMainMenu(this, "Back"));
		this.buttonBack.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.add(this.buttonMap1, this.levelSelectionMenu.getGc());
		this.levelSelectionMenu.getGc().gridx = GridBagConstraints.REMAINDER;
		this.levelSelectionMenu.getGc().gridy = 2;

		this.add(this.buttonMap2, this.levelSelectionMenu.getGc());
		this.levelSelectionMenu.getGc().gridx = GridBagConstraints.REMAINDER;
		this.levelSelectionMenu.getGc().gridy = 3;

		this.add(this.buttonMap3, this.levelSelectionMenu.getGc());
		this.levelSelectionMenu.getGc().gridx = GridBagConstraints.REMAINDER;
		this.levelSelectionMenu.getGc().gridy = 4;

		this.add(this.buttonBack, this.levelSelectionMenu.getGc());
		this.levelSelectionMenu.getGc().gridx = GridBagConstraints.REMAINDER;
		this.levelSelectionMenu.getGc().gridy = GridBagConstraints.REMAINDER;
	}

	public void buildNameSelectionPanel(){
		this.nameSelectionPanel = new NameSelectionPanel("res/LaMatrice.jpg");
		setContentPane(this.nameSelectionPanel);
		System.out.println("yoyo");
		this.buttonValidate = new JButton(new DisplayMainMenu(this,"Validate"));
		this.buttonValidate.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.buttonExit = new JButton(new ExitGame(this,"Exit"));
		this.buttonExit.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.add(this.buttonValidate, this.nameSelectionPanel.getGc());
		this.nameSelectionPanel.getGc().gridx = GridBagConstraints.REMAINDER;
		this.nameSelectionPanel.getGc().gridy = 4;

		this.add(this.buttonExit, this.nameSelectionPanel.getGc());
		this.nameSelectionPanel.getGc().gridx = GridBagConstraints.REMAINDER;
		this.nameSelectionPanel.getGc().gridy = GridBagConstraints.REMAINDER;
	}

	public JPanel getMainMenu() {
		return this.mainMenu;
	}

	public JPanel getLevelSelectionMenu() {
		return this.levelSelectionMenu;
	}



}
