package com.towerdefense.hci;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LevelSelectionPanel extends JPanel {

	private final JLabel title;
	private final JButton buttonMap1;
	private final JButton buttonMap2;
	private final JButton buttonMap3;
	private final JButton buttonReturn;

	public  LevelSelectionPanel() {
		this.title = new JLabel("Level Slection");
		this.buttonMap1 = new JButton("MotherBoard Attack");
		this.buttonMap2 = new JButton("Hard Drive Disk Attack");
		this.buttonMap3 = new JButton("Bios Attack");
		this.buttonReturn = new JButton("Back");

		setLayout(new GridBagLayout());
		final GridBagConstraints gc = new GridBagConstraints();

		gc.weighty = 9;
		gc.weightx = 11;

		this.add(this.title, gc);
		gc.gridx = GridBagConstraints.REMAINDER;
		gc.gridy = 1;

		this.add(this.buttonMap1, gc);
		gc.gridx = GridBagConstraints.REMAINDER;
		gc.gridy = 2;

		this.add(this.buttonMap2, gc);
		gc.gridx = GridBagConstraints.REMAINDER;
		gc.gridy = 3;

		this.add(this.buttonMap3, gc);
		gc.gridx = GridBagConstraints.REMAINDER;
		gc.gridy = 4;

		this.add(this.buttonReturn, gc);
		gc.gridx = GridBagConstraints.REMAINDER;
		gc.gridy = GridBagConstraints.REMAINDER;

	}
}
