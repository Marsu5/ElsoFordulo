package hu.tokingame.elso.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import hu.tokingame.elso.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = MyGdxGame.WORLD_WIDTH;
		config.height = MyGdxGame.WORLD_HEIGHT;
		new LwjglApplication(new MyGdxGame(), config);
	}
}
