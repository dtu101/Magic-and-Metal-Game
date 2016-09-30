package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.entities.Player;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	Player p;
	
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("assets/DungeonFloor1.png");
		
		p = new Player("Alex");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 640 - img.getWidth()/2,360 - img.getHeight()/2);
		batch.end();
	
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
