package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
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
    private TextButton showDoge;
    private TextButton playButton;


    public MenuStage(Viewport viewport, Batch batch, Game game) {

        super(viewport, batch, game);
        Gdx.input.setCatchBackKey(true);
    }


    public void refresh() {
        backGround.setPosition(0,0);
        //backGround.setSize(getViewport().getWorldWidth(),getViewport().getWorldHeight());
        backGround.setSize(MyScreen.WORLD_WIDTH, MyScreen.WORLD_HEIGHT);
    }
    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.BACK){
           game.setScreen(new ExitScreen(game));
        }
        return false;
    }


    public void init(){
        me = this;
        SzamologepActor.game = game;

        addActor(backGround = new OneSpriteStaticActor(Assets.manager.get(Assets.MENU_BACKGROUDN)));



        addActor(playButton = new MyTextButton("") {
            @Override
            protected void init() {
                this.setTexture(Assets.manager.get(Assets.PLAY_BUTTON));
                this.setSize(Assets.manager.get(Assets.PLAY_BUTTON).getWidth(),Assets.manager.get(Assets.PLAY_BUTTON).getHeight());
                this.setPosition(me.getWidth()/2f-this.getWidth()/2f,me.getHeight()/2f-this.getHeight()/2f);

                addListener(new ClickListener()
                {
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        //super.clicked(event, x, y);
                        if(!Globals.egyediMode){
                            me.game.setScreen(new GameScreen(game));
                        }else{
                            me.game.setScreen(new CustomGameScreen(game));
                        }

                    }
                });
            }

        });


        addActor(settingsButton = new MyTextButton(""){
            @Override
            protected void init() {
                //debug();
                setTexture(Assets.manager.get(Assets.SETTINGS_ICON));
                setSize(Assets.manager.get(Assets.SETTINGS_ICON).getWidth(),Assets.manager.get(Assets.SETTINGS_ICON).getHeight());
                setPosition(MyScreen.WORLD_WIDTH-this.getWidth(),0);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.setScreen(new SettingsScreen(game));
                    }
                });
            }
        });

        addActor(new MyTextButton(""){
            @Override
            protected void init() {
                super.init();
                setPosition(0,0);
                setSize(Assets.manager.get(Assets.CREDITS).getWidth(),Assets.manager.get(Assets.CREDITS).getHeight());
                setTexture(Assets.manager.get(Assets.CREDITS));
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.setScreen(new CreditsScreen(game));
                    }
                });
            }
        });
        addActor(new MyTextButton(""){
            @Override
            protected void init() {
                super.init();
                setPosition(0, 100);
                setSize(Assets.manager.get(Assets.HELP).getWidth(),Assets.manager.get(Assets.HELP).getHeight());
                setTexture(Assets.manager.get(Assets.HELP));
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y){
                        super.clicked(event, x, y);
                        game.setScreen(new HelpScreen(game));
                    }
                });

            }
        });

        addActor(musicButton = new MyTextButton(""){
            @Override
            protected void init() {
                //debug();
                setSize(Assets.manager.get(Assets.SETTINGS_ICON).getWidth(),Assets.manager.get(Assets.SETTINGS_ICON).getHeight());
                setPosition(MyScreen.WORLD_WIDTH-this.getWidth(),settingsButton.getHeight());
                if(Globals.zeneKelle){
                    setTexture(Assets.manager.get(Assets.MUSIC_ON));
                }else{
                    setTexture(Assets.manager.get(Assets.MUSIC_OFF));
                }

                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        Globals.zeneKelle = !Globals.zeneKelle;
                        if (Globals.zeneKelle){
                            setTexture(Assets.manager.get(Assets.MUSIC_ON));
                            Assets.manager.get(Assets.MUSIC).play();
                        }else{
                            setTexture(Assets.manager.get(Assets.MUSIC_OFF));
                            Assets.manager.get(Assets.MUSIC).pause();
                        }
                    }
                });

            }
        });
        addActor(showDoge = new MyTextButton(""){
            @Override
            protected void init() {
                super.init();
                setTexture(Assets.manager.get(Assets.URES));
                setSize(80, 80);
                setPosition(0, MyScreen.WORLD_HEIGHT-80);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        //System.out.println("click");
                        doge();
                    }
                });
            }
        });

        refresh();
    }
    void doge(){
        addActor(new MyTextButton("") {
            @Override
            protected void init() {
                this.setTexture(Assets.manager.get(Assets.DOGE));
                this.setSize(Assets.manager.get(Assets.DOGE).getWidth(),Assets.manager.get(Assets.DOGE).getHeight());
                this.setPosition(me.getWidth()/2f-this.getWidth()/2f,me.getHeight()/2f-this.getHeight()/2f);

                addListener(new ClickListener()
                {
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        //super.clicked(event, x, y);
                        if(!Globals.egyediMode){
                            me.game.setScreen(new GameScreen(game));
                        }else{
                            me.game.setScreen(new CustomGameScreen(game));
                        }

                    }
                });
            }

        });
        playButton.setDisabled(true);
    }
}
