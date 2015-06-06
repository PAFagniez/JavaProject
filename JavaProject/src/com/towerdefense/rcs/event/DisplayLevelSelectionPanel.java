package com.towerdefense.rcs.event;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.towerdefense.hci.Frame;


public class DisplayLevelSelectionPanel extends AbstractAction {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private final Frame frame;

	public DisplayLevelSelectionPanel (Frame frame, String texte){
		super(texte);

		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.frame.buildLevelSelectionMenu();
		this.frame.repaint();
		this.frame.revalidate();
	}

}
