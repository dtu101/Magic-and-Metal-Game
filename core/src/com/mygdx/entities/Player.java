package com.mygdx.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

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
	}
	
	public void render(SpriteBatch batch){
		batch.begin();
		batch.draw(picture, x, y);
		
		
		batch.end();
	}
	

}
