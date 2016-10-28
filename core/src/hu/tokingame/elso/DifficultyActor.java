package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by M on 10/28/2016.
 */

public class DifficultyActor extends Group{
    public static Game game;
    private MyTextButton button1;
    private MyTextButton button2;

    public DifficultyActor() {
        addActor(button1 = new MyTextButton(""){//könnyü
            @Override
            protected void init() {
                super.init();
                setSize(Assets.manager.get(Assets.CHECKBOX).getWidth(),Assets.manager.get(Assets.CHECKBOX).getHeight());
                if (!Globals.nehez){
                    setTexture(Assets.manager.get(Assets.CHECKBOX_CHECKED));
                }else{
                    setTexture(Assets.manager.get(Assets.CHECKBOX));
                }
                setPosition(150,600);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        Globals.nehez = ! Globals.nehez;
                        if (Globals.nehez){
                            button1.setTexture(Assets.manager.get(Assets.CHECKBOX_CHECKED));
                            button2.setTexture(Assets.manager.get(Assets.CHECKBOX));
                        }else {
                            button1.setTexture(Assets.manager.get(Assets.CHECKBOX));
                            button2.setTexture(Assets.manager.get(Assets.CHECKBOX_CHECKED));
                        }
                    }
                });
            }
        });

        MyLabel label1;
        addActor(label1 = new MyLabel("Könnyü"));
        label1.setPosition(150+Assets.manager.get(Assets.CHECKBOX).getWidth(),600);

        addActor(button2 = new MyTextButton(""){//Nehéz
            @Override
            protected void init() {
                super.init();
                setSize(Assets.manager.get(Assets.CHECKBOX).getWidth(),Assets.manager.get(Assets.CHECKBOX).getHeight());
                if (Globals.nehez){
                    setTexture(Assets.manager.get(Assets.CHECKBOX_CHECKED));
                }else{
                    setTexture(Assets.manager.get(Assets.CHECKBOX));
                }
                setPosition(150,480);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        Globals.nehez = ! Globals.nehez;
                        if (!Globals.nehez){
                            button1.setTexture(Assets.manager.get(Assets.CHECKBOX_CHECKED));
                            button2.setTexture(Assets.manager.get(Assets.CHECKBOX));
                        }else {
                            button1.setTexture(Assets.manager.get(Assets.CHECKBOX));
                            button2.setTexture(Assets.manager.get(Assets.CHECKBOX_CHECKED));
                        }
                    }
                });
            }
        });

        MyLabel label2;
        addActor(label2 = new MyLabel("Nehéz"));
        label2.setPosition(150+Assets.manager.get(Assets.CHECKBOX).getWidth(),480);

    }
}
