package com.towerdefense.src.game.pieces.attackers;

import com.towerdefense.src.game.pieces.DefenseType;
import com.towerdefense.src.game.pieces.Fighter;
import com.towerdefense.src.game.pieces.Motionable;


public class Attacker extends Fighter implements Motionable {

	protected int moveSpeed;
	protected int direction;
	protected DefenseType defensetype;

	public int getMoveSpeed() {
		return this.moveSpeed;
	}

	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	public int getDirection() {
		return this.direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

}