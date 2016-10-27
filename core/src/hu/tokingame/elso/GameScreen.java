package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

/**
 * Created by M on 10/14/2016.
 */

public class GameScreen extends MyScreen {
    GameStage gameStage;

    public GameScreen(Game game) {
        super(game);
        gameStage = new GameStage(viewport,spriteBatch,game);
        Gdx.input.setInputProcessor(gameStage);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        gameStage.act(delta);
        gameStage.draw();
    }
}
