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

import com.towerdefense.rcs.event.DisplayLevelSelectionPanel;
import com.towerdefense.rcs.event.ExitGame;

public class MainMenuPanel extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Frame frame;
	private JLabel labelExiageek;
	private JLabel labelTitle;
	private GridBagLayout gbl;
	private GridBagConstraints gc;
	private final Image img;
	private JButton buttonPlay;
	private JButton buttonLoad;
	private JButton buttonExit;

	public MainMenuPanel (Frame frame, String img){
		this(new ImageIcon(img).getImage());
		this.frame = frame;

		this.labelExiageek = new JLabel("ExiaGeek");
		this.labelExiageek.setFont(new Font("Tele-Marines", Font.PLAIN, 40));
		this.labelExiageek.setForeground(Color.GREEN);

		this.labelTitle = new JLabel("Tower Defense");
		this.labelTitle.setFont(new Font("Tele-Marines", Font.PLAIN, 40));
		this.labelTitle.setForeground(Color.GREEN);

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

		this.buttonPlay = new JButton(new DisplayLevelSelectionPanel(this.frame, "Play"));
		this.buttonPlay.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.buttonLoad = new JButton("Load");
		this.buttonLoad.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.buttonExit = new JButton(new ExitGame(this.frame,"Exit"));
		this.buttonExit.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.add(this.buttonPlay, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = 3;

		this.add(this.buttonLoad, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = 4;

		this.add(this.buttonExit, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = GridBagConstraints.REMAINDER;

	}

	public MainMenuPanel(Image img) {
		this.img = img;
		final Dimension size = new Dimension(this.img.getWidth(null), this.img.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
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
