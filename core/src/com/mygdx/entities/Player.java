package com.mygdx.entities;

import com.badlogic.gdx.scenes.scene2d.Actor;

public class Player extends Actor{
	Integer health;
	Integer mana;
	Integer energy;
	Integer experience;
	String name;
	
	public Player(String s){
		name = s;
	}

}
