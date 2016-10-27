package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

/**
 * Created by M on 10/27/2016.
 */

public class CreditsScreen extends MyScreen {
    CreditsStage creditsStage;

    public CreditsScreen(Game game) {
        super(game);
        creditsStage = new CreditsStage(viewport,spriteBatch,game);
        Gdx.input.setInputProcessor(creditsStage);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        creditsStage.act();
        creditsStage.draw();
    }

}
