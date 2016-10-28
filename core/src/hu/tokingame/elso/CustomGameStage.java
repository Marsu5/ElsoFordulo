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

public class CustomGameStage extends MyStage {
    CustomGameStage stage;
    private CustomNotepadActor customNotepadActor;

    public CustomGameStage(Viewport viewport, Batch batch, Game game) {
        super(viewport, batch, game);
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
        stage = this;
        Gdx.input.setCatchBackKey(true);
        addActor(new OneSpriteStaticActor(Assets.manager.get(Assets.MAIN_BACKGROUND)){
            @Override
            protected void init() {
                super.init();
                setPosition(0f,0f);
                //setSize(stage.getViewport().getWorldWidth(),stage.getViewport().getWorldHeight());
                setSize(MyScreen.WORLD_WIDTH,MyScreen.WORLD_HEIGHT);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        System.out.println(x+", "+y);
                    }
                });
            }
        });
        addActor(customNotepadActor=new CustomNotepadActor());// jegyzettomb sorok
        customNotepadActor.setPosition(0,0);

        SzamologepActor szamologepActor;
        addActor(szamologepActor = new SzamologepActor());// szamolo gep gombok.
        szamologepActor.setPosition(0,0);

        addActor(new MyActorInit() {
            @Override
            void init() { // uj játék gomb
                this.setPosition(520,13);
                this.setSize(100,100);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.setScreen(new GameScreen(game));
                    }
                });
            }
        });



        setDebugAll(false);
    }
}
