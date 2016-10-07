package com.mygdx.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.helper.Constants;

public class Player extends Actor{
	Integer health;
	Integer mana;
	Integer energy;
	Integer experience;
	String name;
	Texture picture;
	
	float vx;
	float vy;
	
	boolean[] moveDir;
	
	public Player(String s){
		picture = new Texture("assets/Player.png");
		name = s;
		this.setPosition(10, 10);
		moveDir = new boolean[4];
	}
	
	public Player(){
		picture = new Texture("assets/Player.png");
		this.setPosition(100, 100);
	}
	
	public void render(Batch batch){
		batch.draw(picture, getX(), getY(), 100, 100);
	}
	
	public void act(float delta){
		this.setX(this.getX() + vx);
		this.setY(this.getY() + vy);
		Gdx.app.log("Player move()", "vX:" + vx + " vY:" + vy);
	}
	
	public void move(int direction){
		switch(direction){
		case 0:
			moveDir[0] = true;
			moveDir[1] = false;
			
			if(vx >= -Constants.MAX_VELOCITY){
				vx -= Constants.ACCELERATION;
			}else{
				vx = -Constants.MAX_VELOCITY;
			}
			break;
		case 1:
			moveDir[0] = false;
			moveDir[1] = true;
			
			if(vx <= Constants.MAX_VELOCITY){
				vx += Constants.ACCELERATION;
			}else{
				vx = Constants.MAX_VELOCITY;
			}
			break;
		case 2:
			moveDir[2] = true;
			moveDir[3] = false;
			
			if(vy <= Constants.MAX_VELOCITY){
				vy += Constants.ACCELERATION;
			}else{
				vy = Constants.MAX_VELOCITY;
			}
			break;
		case 3:
			moveDir[2] = false;
			moveDir[3] = true;
			
			if(vy >= -Constants.MAX_VELOCITY){
				vy -= Constants.ACCELERATION;
			}else{
				vy = -Constants.MAX_VELOCITY;
			}
			break;
		default:
			break;		
		}
	}
	

}
