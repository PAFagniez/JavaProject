package com.towerdefense.hci;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.towerdefense.rcs.event.DisplayMainMenu;
import com.towerdefense.rcs.event.ExitGame;

public class NameSelectionPanel extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JLabel title;
	private JTextField nameTextField;
	private GridBagLayout gbl;
	private GridBagConstraints gc;
	private final Image img;
	private Frame frame;
	private JButton buttonValidate;
	private JButton buttonExit;

	public NameSelectionPanel (Frame frame, String img){

		this(new ImageIcon(img).getImage());
		this.frame = frame;

		this.title = new JLabel("Enter your name");
		this.title.setFont(new Font("Tele-Marines", Font.PLAIN, 40));
		this.title.setForeground(Color.GREEN);

		this.nameTextField = new JTextField("Player", 20);

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

		this.buttonValidate = new JButton(new DisplayMainMenu(this.frame,"Validate"));
		this.buttonValidate.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.buttonExit = new JButton(new ExitGame(this.frame,"Exit"));
		this.buttonExit.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.add(this.buttonValidate, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = 4;

		this.add(this.buttonExit, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = GridBagConstraints.REMAINDER;

	}

	public NameSelectionPanel(Image image) {
		this.img = image;
		final Dimension size = new Dimension(this.img.getWidth(null), this.img.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
	}

	public JTextField getNameTextField() {
		return this.nameTextField;
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

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(this.img, 0, 0, null);
	}
}
