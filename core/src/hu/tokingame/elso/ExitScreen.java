package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

/**
 * Created by davim on 2016. 10. 28..
 */

public class ExitScreen extends MyScreen {
    ExitStage exitStage;

    public ExitScreen(Game game) {
        super(game);
        exitStage = new ExitStage(viewport,spriteBatch,game);
        Gdx.input.setInputProcessor(exitStage);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        exitStage.act();
        exitStage.draw();
    }
}
