package com.towerdefense.src.game.pieces;


public class Fighter extends Piece implements Fighterable, Dieable {

	protected int attackRange;

	public int getAttackRange() {
		return this.attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}

	@Override
	public boolean die() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 0;
	}

}