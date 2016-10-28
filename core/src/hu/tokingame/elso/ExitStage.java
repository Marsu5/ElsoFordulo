package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by davim on 2016. 10. 28..
 */

public class ExitStage extends MyStage {
    public ExitStage(Viewport viewport, Batch batch, Game game) {
        super(viewport, batch, game);
        Gdx.input.setCatchBackKey(true);
        init();
    }

    @Override
    public boolean keyDown(int keyCode) {
        if(keyCode == Input.Keys.BACK){
            game.setScreen(new MenuScreen(game));
        }
        return false;
    }

    protected void init(){
        addActor(new OneSpriteStaticActor(Assets.manager.get(Assets.EXITSCREEN)) {
            @Override
            protected void init() {
                super.init();
                this.setPosition(0,0);
                this.setSize(MyScreen.WORLD_WIDTH, MyScreen.WORLD_HEIGHT);
            }

        });
        addActor(new MyActorInit() { // pipa (kilépés)
            @Override
            void init() {
                setSize(150, 150);
                setPosition(320, 100);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        System.exit(0);
                    }
                });
            }
        });
        addActor(new MyActorInit() { // pipa (kilépés)
            @Override
            void init() {
                setSize(150, 150);
                setPosition(910, 110);
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
