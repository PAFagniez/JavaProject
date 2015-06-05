package com.towerdefense.hci;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private final JLabel title;
	private final JButton buttonPlay;
	private final JButton buttonLoad;
	private final JButton buttonExit;

	public MainPanel (){
		this.title = new JLabel("Tower Defense");
		this.buttonPlay = new JButton("Play");
		this.buttonLoad = new JButton("Load");
		this.buttonExit = new JButton("Exit");


		setLayout(new GridBagLayout());
		final GridBagConstraints gc = new GridBagConstraints();

		gc.weighty = 9;
		gc.weightx = 11;

		this.add(this.title, gc);
		gc.gridx = GridBagConstraints.REMAINDER;
		gc.gridy = 1;

		this.add(this.buttonPlay, gc);
		gc.gridx = GridBagConstraints.REMAINDER;
		gc.gridy = 2;

		this.add(this.buttonLoad, gc);
		gc.gridx = GridBagConstraints.REMAINDER;
		gc.gridy = 3;

		this.add(this.buttonExit, gc);
		gc.gridx = GridBagConstraints.REMAINDER;
		gc.gridy = GridBagConstraints.REMAINDER;

	}

}
