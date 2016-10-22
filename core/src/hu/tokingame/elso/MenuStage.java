package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by davim on 2016. 10. 07..
 */

public class MenuStage extends MyStage {



    private MyStage me;
    private OneSpriteStaticActor backGround;
    private TextButton.TextButtonStyle style;
    private TextButton settingsButton;
    private TextButton musicButton;

    public MenuStage(Viewport viewport, Game game) {
        super(viewport, game);
    }

    public MenuStage(Viewport viewport, Batch batch, Game game) {

        super(viewport, batch, game);
    }

    public MenuStage(Game game) {

        super(game);
    }

    public void refresh() {

        backGround.setSize(getViewport().getWorldWidth(),getViewport().getWorldHeight());

    }

    public void init(){
        me = this;

        addActor(backGround = new OneSpriteStaticActor(Assets.manager.get(Assets.MENU_BACKGROUDN)));



        addActor(new MyTextButton("Egyszerű Mód") {
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


        addActor(settingsButton = new MyTextButton(""){
            @Override
            protected void init() {
                debug();
                setTexture(Assets.manager.get(Assets.SETTINGS_ICON));
                setSize(Assets.manager.get(Assets.SETTINGS_ICON).getWidth(),Assets.manager.get(Assets.SETTINGS_ICON).getHeight());
                setPosition(me.getWidth()-this.getWidth(),0);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.setScreen(new SettingsScreen(game));
                    }
                });
            }
        });

        addActor(musicButton = new MyTextButton(""){
            @Override
            protected void init() {
                debug();
                setTexture(Assets.manager.get(Assets.MUSIC_ON));
                setSize(Assets.manager.get(Assets.SETTINGS_ICON).getWidth(),Assets.manager.get(Assets.SETTINGS_ICON).getHeight());
                setPosition(me.getWidth()-this.getWidth(),settingsButton.getHeight());
            }
        });

        refresh();
    }
}
