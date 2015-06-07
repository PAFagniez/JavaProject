package com.towerdefense.rcs.game.pieces;

import javax.swing.JLabel;

public abstract class Piece {

	protected int health;
	protected JLabel image;
	protected int x;
	protected int y;

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public JLabel getImage() {
		return this.image;
	}

	public void setImage(JLabel image) {
		this.image = image;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

}