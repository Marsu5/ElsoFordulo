package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

/**
 * Created by davim on 2016. 10. 07..
 */

public class MenuKepernyo extends MyScreen {
    protected MenuStage menuStage;



    public MenuKepernyo(Game game) {
        super(game);
        menuStage = new MenuStage(viewport, spriteBatch, game);
        Gdx.input.setInputProcessor(menuStage);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        menuStage.act(delta);
        menuStage.draw();
    }

    @Override
    public void dispose() {
        super.dispose();
        menuStage.dispose();
    }
}
