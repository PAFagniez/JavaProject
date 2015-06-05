package com.towerdefense.hci;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class ContentPanel extends JPanel {

	private final MainMenuPanel mainMenuPanel;

	private final LevelSelectionPanel levelSelectionPanel;

	private final  CardLayout card;

	public ContentPanel(){
		this.mainMenuPanel = new MainMenuPanel();
		this.levelSelectionPanel = new LevelSelectionPanel();

		setLayout(this.card);
		this.add(this.mainMenuPanel, "mainMenu");
		this.add(this.levelSelectionPanel, "levelMenu");
	}

	public LevelSelectionPanel getLevelSelectionPanel() {
		return this.levelSelectionPanel;
	}

	public MainMenuPanel getMainMenuPanel() {
		return this.mainMenuPanel;
	}

	public CardLayout getCard() {
		return this.card;
	}

}
