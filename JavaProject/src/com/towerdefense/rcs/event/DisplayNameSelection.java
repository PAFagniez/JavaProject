package com.towerdefense.rcs.event;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.towerdefense.hci.Frame;

public class DisplayNameSelection extends AbstractAction {

	private final Frame frame;

	public DisplayNameSelection (Frame frame, String texte){
		super(texte);

		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.frame.buildNameSelectionPanel();

		this.frame.repaint();
		this.frame.revalidate();
	}


}
