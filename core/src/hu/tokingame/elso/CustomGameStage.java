package hu.tokingame.elso;

import com.badlogic.gdx.Game;
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

    public CustomGameStage(Game game) {
        super(game);
    }

    public CustomGameStage(Viewport viewport, Batch batch, Game game) {
        super(viewport, batch, game);
    }

    public CustomGameStage(Viewport viewport, Game game) {
        super(viewport, game);
    }

    @Override
    protected void init() {
        stage = this;
        addActor(new OneSpriteStaticActor(Assets.manager.get(Assets.MAIN_BACKGROUND)){
            @Override
            protected void init() {
                super.init();
                setPosition(0f,0f);
                setSize(stage.getViewport().getWorldWidth(),stage.getViewport().getWorldHeight());
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        System.out.println(x+", "+y);
                    }
                });
            }
        });
        addActor(new SzamologepActor());// szamolo gep gombok.
        addActor(customNotepadActor = new CustomNotepadActor());// jegyzettomb sorok
        addActor(new MyActorInit() {
            @Override
            void init() { // uj játék gomb
                this.setPosition(0,0);
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
