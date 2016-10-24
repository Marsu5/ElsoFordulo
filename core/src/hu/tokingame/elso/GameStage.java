package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by M on 10/14/2016.
 */

public class GameStage extends MyStage {

    GameStage stage;
    private NotepadActor notepadActor;

    public GameStage(Game game) {
        super(game);
    }

    public GameStage(Viewport viewport, Batch batch, Game game) {
        super(viewport, batch, game);
    }

    public GameStage(Viewport viewport, Game game) {
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
            }
        });
        addActor(new SzamologepActor());
        addActor(notepadActor=new NotepadActor());
        setDebugAll(true);

    }
}
