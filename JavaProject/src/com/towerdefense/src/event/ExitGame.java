package com.towerdefense.src.event;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.towerdefense.hci.Frame;


public class ExitGame extends AbstractAction {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private final Frame frame;

	public ExitGame (Frame frame, String texte){
		super(texte);

		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
