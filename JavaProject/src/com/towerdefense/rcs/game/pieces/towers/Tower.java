package com.towerdefense.rcs.game.pieces.towers;

import com.towerdefense.rcs.game.Upgradable;
import com.towerdefense.rcs.game.pieces.Fighter;

public class Tower extends Fighter implements Upgradable{

	@Override
	public boolean upgrade() {
		// TODO Auto-generated method stub
		return false;
	}

	public void move() {
	}
		public boolean die(){
			return false;
			
	}
		
		public int attack(){
			return attackRange;
			
		}

}
	

