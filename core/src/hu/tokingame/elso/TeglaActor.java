package hu.tokingame.elso;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by M on 10/14/2016.
 */

public class TeglaActor extends MyActor {
    protected Sprite sprite;

    public TeglaActor(Sprite sprt) {
        this.sprite = sprt;
    }

    protected void init(){
        setSize(sprite.getWidth(), sprite.getHeight());
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        sprite.draw(batch);
    }

    @Override
    protected void sizeChanged() {
        super.sizeChanged();
        sprite.setSize(getWidth(),getHeight());
        sprite.setOrigin(getWidth()/2,getHeight()/2);
    }

    @Override
    protected void positionChanged() {
        super.positionChanged();
        sprite.setPosition(getX(),getY());
    }

    @Override
    protected void rotationChanged() {
        super.rotationChanged();
        sprite.setRotation(getRotation());
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
