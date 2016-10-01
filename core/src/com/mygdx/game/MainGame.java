package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.screen.GameScreen;

public class MainGame extends Game {
	public final int GAMESCREEN = 0;
	
	SpriteBatch batch;
	
	private ArrayList<Screen> screens = new ArrayList<Screen>();
	
	public void create () {
		batch = new SpriteBatch();
		
		screens.add(new GameScreen(this));
		setScreen(GAMESCREEN);
	}
	
	public void setScreen(int screen){
		this.setScreen(screens.get(screen));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
