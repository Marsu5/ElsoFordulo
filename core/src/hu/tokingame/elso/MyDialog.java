package hu.tokingame.elso;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * Created by M on 10/26/2016.
 */

public class MyDialog extends Dialog {

    private static WindowStyle windowStyle;

    static
    {
        windowStyle = new WindowStyle();
        windowStyle.titleFont = Assets.manager.get(Assets.CALIBRIL_FONT);

        Pixmap p = new Pixmap(1,1, Pixmap.Format.RGB888);
        p.setColor(0.1f,0.2f,0.2f, 0.5f);
        p.fill();
        windowStyle.background = new TextureRegionDrawable(new TextureRegion(new Texture(p)));
    }



    public MyDialog(String title, WindowStyle windowStyle) {
        super(title, windowStyle);
    }

    public MyDialog(String title) {
        super(title, windowStyle);
    }

    public void setTexture(Texture texture){
        this.setBackground(new TextureRegionDrawable(new TextureRegion(texture)));
    }

}
