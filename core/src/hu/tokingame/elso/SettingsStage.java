package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by M on 10/21/2016.
 */

public class SettingsStage extends MyStage {

    public SettingsStage(Game game) {
        super(game);
    }

    public SettingsStage(Viewport viewport, Batch batch, Game game) {
        super(viewport, batch, game);
    }

    public SettingsStage(Viewport viewport, Game game) {
        super(viewport, game);
    }

    @Override
    protected void init() {

    }
}
