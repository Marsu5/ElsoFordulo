package hu.tokingame.elso;

import com.badlogic.gdx.Game;

/**
 * Created by M on 10/7/2016.
 */

public class BetoltoKepernyo extends MyScreen {

    public BetoltoKepernyo(Game game) {
        super(game);
        setBackGroundColor(0f, 0f, 0f);
    }

    @Override
    public void show() {
        Assets.manager.finishLoading();
        Assets.load();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        if (Assets.manager.update()) {
            Assets.afterLoaded();
            game.setScreen(new MenuKepernyo(game));
        }
        spriteBatch.begin();
        //Globals.FONT_HOBO_STD.draw(spriteBatch,"Betöltés: " + Assets.manager.getLoadedAssets() + "/" + (Assets.manager.getQueuedAssets()+Assets.manager.getLoadedAssets()) + " (" + ((int)(Assets.manager.getProgress()*100f)) + "%)",0,50);
        spriteBatch.end();
    }

    @Override
    public void hide() {

    }
}
