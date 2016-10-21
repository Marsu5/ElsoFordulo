package hu.tokingame.elso;

import com.badlogic.gdx.Game;

/**
 * Created by M on 10/14/2016.
 */

public class GameScreen extends MyScreen {
    GameStage gameStage;

    public GameScreen(Game game) {
        super(game);
        gameStage = new GameStage(viewport,spriteBatch,game);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        gameStage.act();
        gameStage.draw();
    }
}
