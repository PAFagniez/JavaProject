package com.towerdefense.hci;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenuPanel extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private final JLabel labelExiageek;
	private final JLabel labelTitle;
	private final GridBagLayout gbl;
	private final GridBagConstraints gc;

	public MainMenuPanel (){

		this.labelExiageek = new JLabel("ExiaGeek");
		this.labelExiageek.setFont(new Font("Tele-Marines", Font.PLAIN, 30));

		this.labelTitle = new JLabel("Tower Defense");
		this.labelTitle.setFont(new Font("Tele-Marines", Font.PLAIN, 30));

		this.gbl = new GridBagLayout();
		setLayout(this.gbl);
		this.gc = new GridBagConstraints();
		this.gc.weighty = 9;
		this.gc.weightx = 11;

		this.add(this.labelExiageek, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = 1;

		this.add(this.labelTitle, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = 2;
	}

	public GridBagLayout getGbl() {
		return this.gbl;
	}

	public GridBagConstraints getGc() {
		return this.gc;
	}
}
