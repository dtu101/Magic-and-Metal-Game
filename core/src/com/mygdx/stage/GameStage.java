package com.mygdx.stage;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.entities.Player;
import com.mygdx.game.MainGame;

public class GameStage extends Stage{
	final MainGame game;
	
	Texture background;
	Player player;
	
	public GameStage(final MainGame game){
		this.game = game;
		player = new Player();
		
		init();
	}
	
	
	public void init(){
		background = new Texture("assets/DungeonFloor1.png");
		
		addActor(player);
	}
	
	@Override
	public void act(float delta){
		super.act(delta);
	}
	
	@Override
	public void draw(){
		super.draw();
		
		//Draw the background
		this.getBatch().begin();
		
		
		this.getBatch().draw(background, 640 - background.getWidth()/2,360 - background.getHeight()/2);
		
		player.render(this.getBatch());
		
		
		this.getBatch().end();
	}
}
