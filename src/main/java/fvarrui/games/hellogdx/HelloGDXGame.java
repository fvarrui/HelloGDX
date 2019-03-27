package fvarrui.games.hellogdx;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HelloGDXGame extends Game {

	private Texture texture;
	private SpriteBatch batch;

	public void create() {
		batch = new SpriteBatch();
		texture = new Texture(Gdx.files.internal("assets/world.png"));
	}

	@Override
	public void render() {

		Gdx.gl.glClearColor(0,0,0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		float x = (Gdx.graphics.getWidth() - texture.getWidth()) / 2;
		float y = (Gdx.graphics.getHeight() - texture.getHeight()) / 2;
		
		batch.begin();
		batch.draw(texture, x, y, texture.getWidth(), texture.getHeight());
		batch.end();
		
	}

	public static void main(String[] args) {
		Game game = new HelloGDXGame();
		new LwjglApplication(game, "Hello GDX", 640, 480);
	}

}
