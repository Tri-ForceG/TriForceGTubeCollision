package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class MyGdxGame extends Game {
	SpriteBatch batch;
	TextureAtlas taMegaman;
	Sprite[] spMegaman;
	int j, nSpeed = 0;
	com.badlogic.gdx.audio.Music Music;
	com.badlogic.gdx.audio.Sound Sound;

	@Override
	public void create() {
		//j = 0;
		//nSpeed = 0;
		Music = Gdx.audio.newMusic(Gdx.files.internal("ElginMusic.mp3")); // not the greatest naming
		Sound = Gdx.audio.newSound(Gdx.files.internal("Hitmarker.mp3"));
		Music.setLooping(true); // loops the mp3 file
		Music.play();
		Music.setVolume(1.0f); //controls how loud the music is
		setScreen(new Box2D(this));

	}

	@Override
	public void render() {
		super.render();

	}
}
