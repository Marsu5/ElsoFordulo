package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by davim on 2016. 10. 07..
 */

public class MenuStage extends MyStage {



    private MyStage me;

    public MenuStage(Viewport viewport, Game game) {
        super(viewport, game);
    }

    public MenuStage(Viewport viewport, Batch batch, Game game) {

        super(viewport, batch, game);
    }

    public MenuStage(Game game) {

        super(game);
    }



    public void init(){
        me = this;

        addActor(new MyTextButton("Egyszerü Mód")
        {
            @Override
            protected void init() {
                this.setPosition(me.getWidth()/2f-this.getWidth()/2f,me.getHeight()/2f-this.getHeight()/2f);

                addListener(new ClickListener()
                {
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        //super.clicked(event, x, y);
                        me.game.setScreen(new GameScreen(game));
                    }
                });
            }
        });

        addActor(new MyTextButton("Egyéni Mód") {
            @Override
            protected void init() {
                this.setPosition(me.getWidth()/2f-this.getWidth()/2f,me.getHeight()/2f-this.getHeight()*2f);
                addListener(new ClickListener() {
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        me.game.setScreen(new GameScreen(game));
                    }
                });
            }
        });
    }
}
