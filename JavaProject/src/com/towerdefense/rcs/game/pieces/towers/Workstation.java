package com.towerdefense.rcs.game.pieces.towers;

import javax.swing.JLabel;

import com.towerdefense.rcs.game.Repairable;
import com.towerdefense.rcs.game.pieces.Dieable;
import com.towerdefense.rcs.game.pieces.Piece;

public class Workstation extends Piece implements Dieable, Repairable {

	public Workstation() {
		this.health = 200;
		this.image = new JLabel("res/workStation.jpg");
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean die() {
		// TODO Auto-generated method stub
		return false;
	}

}