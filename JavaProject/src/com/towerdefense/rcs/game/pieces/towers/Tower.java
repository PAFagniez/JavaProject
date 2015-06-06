package com.towerdefense.rcs.game.pieces.towers;

import java.awt.Image;

import com.towerdefense.rcs.game.Upgradable;
import com.towerdefense.rcs.game.pieces.DamageType;
import com.towerdefense.rcs.game.pieces.Fighter;

public class Tower extends Fighter implements Upgradable{
	
	protected int level;
	protected int attackSpeed;
	protected DamageType damagetype;
	protected int attackRange;
	protected int health;
	protected Image image;
	protected int x;
	protected int y;
	

	public Tower() {
	}
	
	
		public boolean die(){
			return false;	
	}
		
		
		public int attack(){
			return attackRange;
	}

		
		public boolean upgrade() {
			return false;
	}
	
}
	

