package com.mygdx.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Player extends Actor{
	Integer health;
	Integer mana;
	Integer energy;
	Integer experience;
	String name;
	Texture picture;
	
	
	public Player(String s){
		picture = new Texture("assets/Player.png");
		name = s;
		this.setPosition(10, 10);
	}
	
	public Player(){
		picture = new Texture("assets/Player.png");
		this.setPosition(100, 100);
	}
	
	public void render(Batch batch){
		batch.draw(picture, getX(), getY(), 100, 100);
	}
	

}
