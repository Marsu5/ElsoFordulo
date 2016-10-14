package hu.tokingame.elso;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by M on 10/14/2016.
 */

public class OszlopActor extends OneSpriteStaticActor {
    public OszlopActor(Texture texture) {
        super(texture);
    }

    @Override
    public void setY(float y) {
        super.setY(y);
        sprite.setY(y);
    }

    @Override
    public void setX(float x) {
        super.setX(x);
        sprite.setX(x);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }
}
