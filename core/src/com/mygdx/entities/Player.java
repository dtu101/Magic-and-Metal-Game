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
	
	boolean moveLeft;
	boolean moveRight;
	boolean moveUp;
	boolean moveDown;
	
	public Player(String s){
		picture = new Texture("assets/Player.png");
		name = s;
		this.setPosition(10, 10);
		moveLeft = false;
		moveRight = false;
		moveUp = false;
		moveDown = false;
	}
	
	public Player(){
		picture = new Texture("assets/Player.png");
		this.setPosition(100, 100);
	}
	
	public void render(Batch batch){
		batch.draw(picture, getX(), getY(), 64, 128);
	}
	
	public void act(float delta){
		this.setX(this.getX() + vx);
		this.setY(this.getY() + vy);
		
		
		if(!moveLeft && !moveRight){
			if(vx > 0){
				vx -= .5f;
			}else if(vx < 0){
				vx += .5f;
			}
		}
		if(!moveUp && !moveDown){
			if(vy > 0){
				vy -= .5f;
			}else if(vy < 0){
				vy += .5f;
			}
		}
		
		Gdx.app.log("Player move()", "vX:" + vx + " vY:" + vy);
	}
	
	public void stop(int direction){
		switch(direction){
		case 0:
			moveLeft = false;
			break;
		case 1:
			moveRight = false;
			break;
		case 2:
			moveUp = false;
			break;
		case 3:
			moveDown = false;
			break;
		default:
			break;
		}
	}
	
	public void move(int direction){
		switch(direction){
		case 0:
			moveLeft = true;
			moveRight = false;
			
			if(vx >= -Constants.MAX_VELOCITY){
				vx -= Constants.ACCELERATION;
			}else{
				vx = -Constants.MAX_VELOCITY;
			}
			break;
		case 1:
			moveLeft = false;
			moveRight = true;
			
			if(vx <= Constants.MAX_VELOCITY){
				vx += Constants.ACCELERATION;
			}else{
				vx = Constants.MAX_VELOCITY;
			}
			break;
		case 2:
			moveUp = true;
			moveDown = false;
			
			if(vy <= Constants.MAX_VELOCITY){
				vy += Constants.ACCELERATION;
			}else{
				vy = Constants.MAX_VELOCITY;
			}
			break;
		case 3:
			moveUp = false;
			moveDown = true;
			
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
