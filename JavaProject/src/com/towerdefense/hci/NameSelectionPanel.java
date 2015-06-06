package com.towerdefense.hci;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NameSelectionPanel extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private final JLabel title;
	private final JTextField nameTextField;
	private final GridBagLayout gbl;
	private final GridBagConstraints gc;

	public NameSelectionPanel (){
		this.title = new JLabel("Enter your name");
		this.title.setFont(new Font("Tele-Marines", Font.PLAIN, 30));
		add(this.title, "NORTH");

		this.nameTextField = new JTextField(20);

		this.gbl = new GridBagLayout();
		setLayout(this.gbl);
		this.gc = new GridBagConstraints();
		this.gc.weighty = 9;
		this.gc.weightx = 11;

		this.add(this.title, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = 1;


		this.add(this.nameTextField, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = 2;

	}

	public JLabel getTitle() {
		return this.title;
	}

	public GridBagLayout getGbl() {
		return this.gbl;
	}

	public GridBagConstraints getGc() {
		return this.gc;
	}
}
