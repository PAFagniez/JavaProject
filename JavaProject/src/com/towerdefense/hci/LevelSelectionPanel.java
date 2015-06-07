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

import com.towerdefense.rcs.event.DisplayMainMenu;
import com.towerdefense.rcs.event.DisplayMap1;

public class LevelSelectionPanel extends JPanel{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private JLabel title;
	private GridBagLayout gbl;
	private GridBagConstraints gc;
	private final Image img;
	private Frame frame;
	private JButton buttonMap1;
	private JButton buttonMap2;
	private JButton buttonMap3;
	private JButton buttonBack;

	public LevelSelectionPanel (Frame frame, String img){
		this(new ImageIcon(img).getImage());
		this.frame = frame;

		this.title = new JLabel("Level selection");
		this.title.setFont(new Font("Tele-Marines", Font.PLAIN, 40));
		this.title.setForeground(Color.GREEN);

		this.gbl = new GridBagLayout();
		setLayout(this.gbl);
		this.gc = new GridBagConstraints();
		this.gc.weighty = 9;
		this.gc.weightx = 11;

		this.add(this.title, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = 1;

		this.buttonMap1 = new JButton(new DisplayMap1(this.frame, "  MotherBoard Attack  "));
		this.buttonMap1.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.buttonMap2 = new JButton("Hard Drive Disk Attack");
		this.buttonMap2.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.buttonMap3 = new JButton("       Bios Attack      ");
		this.buttonMap3.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.buttonBack = new JButton(new DisplayMainMenu(this.frame, "Back"));
		this.buttonBack.setFont(new Font("Magneto", Font.PLAIN, 20));

		this.add(this.buttonMap1, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = 2;

		this.add(this.buttonMap2, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = 3;

		this.add(this.buttonMap3, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = 4;

		this.add(this.buttonBack, this.gc);
		this.gc.gridx = GridBagConstraints.REMAINDER;
		this.gc.gridy = GridBagConstraints.REMAINDER;

	}

	public LevelSelectionPanel(Image image) {
		this.img = image;
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
