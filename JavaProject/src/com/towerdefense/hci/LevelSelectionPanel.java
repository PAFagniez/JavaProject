package com.towerdefense.hci;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LevelSelectionPanel extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private final JLabel title;
	private final GridBagLayout gbl;
	private final GridBagConstraints gc;

	public LevelSelectionPanel() {
		this.title = new JLabel("Level Slection");
		this.title.setFont(new Font("Tele-Marines", Font.PLAIN, 30));

		this.gbl = new GridBagLayout();
		setLayout(this.gbl);
		this.gc = new GridBagConstraints();
		this.gc.weighty = 9;
		this.gc.weightx = 11;

		this.add(this.title, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = 1;
	}

	public GridBagLayout getGbl() {
		return this.gbl;
	}

	public GridBagConstraints getGc() {
		return this.gc;
	}
}
