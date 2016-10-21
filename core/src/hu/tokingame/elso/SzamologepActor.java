package hu.tokingame.elso;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by davim on 2016. 10. 21..
 */

public class SzamologepActor extends Group {
    public SzamologepActor() {
        addActor(new MyActorInit() {
            @Override
            void init() {
                setPosition(20,20);
                setSize(40,40);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        System.out.println("0");
                    }
                });
            }
        });

        debug();
    }
}
