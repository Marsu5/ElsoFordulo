package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by M on 10/27/2016.
 */

public class CreditsStage extends MyStage {

    private MyLabel label;

    public CreditsStage(Viewport viewport, Batch batch, Game game) {
        super(viewport, batch, game);
        Gdx.input.setCatchBackKey(true);
        init();
    }

    public CreditsStage(Viewport viewport, Game game) {
        super(viewport, game);
        Gdx.input.setCatchBackKey(true);
        init();
    }

    public CreditsStage(Game game) {
        super(game);
        Gdx.input.setCatchBackKey(true);
        init();
    }

    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.BACK){
            game.setScreen(new MenuScreen(game));
        }
        return false;
    }

    @Override
    protected void init() {

        addActor(new OneSpriteStaticActor(Assets.manager.get(Assets.MENU_BACKGROUDN)){
            @Override
            protected void init() {
                super.init();
                this.setPosition(0,0);
                this.setSize(1280,720);
            }
        });

        addActor(label = new MyLabel("Készítették:\n" +
                "-Bálint Dániel - grafika\n" +
                "-Dávid Mátyás - kód és dizájn\n" +
                "-Kovács Zoltán - kód\n" +
                "-Schuh Marcell - kód"));
        label.setPosition(1280/2f-label.getWidth()/2f,720/2f);

        addActor(new MyTextButton("Vissza"){
            @Override
            protected void init() {
                super.init();
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.setScreen(new MenuScreen(game));
                    }
                });
            }
        });

    }
}
