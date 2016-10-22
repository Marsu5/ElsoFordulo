package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

/**
 * Created by M on 10/21/2016.
 */

public class SettingsScreen extends MyScreen {

    private SettingsStage settingsStage;

    public SettingsScreen(Game game) {
        super(game);
        settingsStage = new SettingsStage(viewport, spriteBatch, game);
        Gdx.input.setInputProcessor(settingsStage);
    }
}
