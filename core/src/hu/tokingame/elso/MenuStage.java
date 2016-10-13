package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by davim on 2016. 10. 07..
 */

public class MenuStage extends MyStage {

    public MenuStage(Viewport viewport, Game game) {
        super(viewport, game);
    }

    public MenuStage(Viewport viewport, Batch batch, Game game) {

        super(viewport, batch, game);
    }

    public MenuStage(Game game) {

        super(game);
    }

    public void init(){
        //actorok ide
    }
}
