package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by M on 10/14/2016.
 */

public class GameStage extends MyStage {

    GameStage stage;
    private NotepadActor notepadActor;



    public GameStage(Viewport viewport, Batch batch, Game game) {
        super(viewport, batch, game);
        Gdx.input.setCatchBackKey(true);
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
                setSize(1280,720);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        System.out.println(x+", "+y);
                    }
                });
            }
        });
        addActor(notepadActor=new NotepadActor());// jegyzettomb sorok
        notepadActor.setPosition(0,0);

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

        setDebugAll(true);

    }
}
