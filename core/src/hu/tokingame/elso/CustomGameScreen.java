package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

/**
 * Created by M on 10/27/2016.
 */

public class CustomGameScreen extends MyScreen {
    CustomGameStage customGameStage;

    public CustomGameScreen(Game game) {
        super(game);
        customGameStage = new CustomGameStage(viewport,spriteBatch,game);
        Gdx.input.setInputProcessor(customGameStage);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        customGameStage.act();
        customGameStage.draw();
    }
}
