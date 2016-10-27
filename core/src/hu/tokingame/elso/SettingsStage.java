package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Slider;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by M on 10/21/2016.
 */

public class SettingsStage extends MyStage {


    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.BACK){
            game.setScreen(new MenuScreen(game));
        }
        return false;
    }

    public SettingsStage(Viewport viewport, Batch batch, Game game) {
        super(viewport, batch, game);
        Gdx.input.setCatchBackKey(true);
        init();
    }




    @Override
    protected void init() {

        addActor(new OneSpriteStaticActor(Assets.manager.get(Assets.MENU_BACKGROUDN)){
            @Override
            protected void init() {
                super.init();
                setPosition(0,0);
                setSize(1280,720);
            }
        });

        addActor(new MyTextButton(""){
            @Override
            protected void init() {
                super.init();
                setSize(Assets.manager.get(Assets.CHECKBOX).getWidth(),Assets.manager.get(Assets.CHECKBOX).getHeight());
                if (Globals.egyediMode){
                    setTexture(Assets.manager.get(Assets.CHECKBOX_CHECKED));
                }else{
                    setTexture(Assets.manager.get(Assets.CHECKBOX));
                }
                setPosition(0,720-getHeight());
                final MyTextButton MyTextButton = this;
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        Globals.egyediMode = ! Globals.egyediMode;
                        if (Globals.egyediMode){
                            MyTextButton.setTexture(Assets.manager.get(Assets.CHECKBOX_CHECKED));
                        }else {
                            MyTextButton.setTexture(Assets.manager.get(Assets.CHECKBOX));
                        }
                    }
                });
            }
        });

        MyLabel label1;
        addActor(label1 = new MyLabel("Egyedi mód engedélyezése."));
        label1.setPosition(0+Assets.manager.get(Assets.CHECKBOX).getWidth(),720-label1.getHeight());

        addActor(new MyTextButton("Vissza"){
            @Override
            protected void init() {
                super.init();
                setPosition(0,0);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.setScreen(new MenuScreen(game));
                    }
                });
            }
        });
        Slider.SliderStyle sliderStyle = new Slider.SliderStyle();


    }
}
