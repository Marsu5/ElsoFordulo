package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by M on 10/14/2016.
 */

public class GameStage extends MyStage {
    public GameStage(Game game) {
        super(game);
    }

    public GameStage(Viewport viewport, Batch batch, Game game) {
        super(viewport, batch, game);
    }

    public GameStage(Viewport viewport, Game game) {
        super(viewport, game);
    }

    @Override
    protected void init() {
        addActor(new SzamologepActor());
        setDebugAll(true);
    }
}
