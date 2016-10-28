package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

/**
 * Created by M on 10/28/2016.
 */

public class HelpScreen extends MyScreen {

    HelpStage helpStage;

    public HelpScreen(Game game) {
        super(game);
        helpStage = new HelpStage(viewport,spriteBatch,game);
        Gdx.input.setInputProcessor(helpStage);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        helpStage.act();
        helpStage.draw();
    }

}
