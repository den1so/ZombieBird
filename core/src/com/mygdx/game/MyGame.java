package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.kilobolt.screens.GameScreen;
import com.kilobolt.zbHelpers.AssetLoader;
/**
 * By Xamel1on.
 */

public class MyGame extends Game {

	@Override
	public void create() {
		Gdx.app.log("MyGame", "created");
		AssetLoader.load();
		setScreen(new GameScreen());

	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}
