package hu.tokingame.elso;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

/**
 * Created by M on 10/21/2016.
 */

    import com.badlogic.gdx.graphics.Pixmap;
    import com.badlogic.gdx.graphics.Texture;
    import com.badlogic.gdx.graphics.g2d.TextureRegion;
    import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
    import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

    /**
     * Created by tuskeb on 2016. 09. 30..
     */
    public class MyTextButton extends TextButton{
        private TextButton button;
        static TextButton.TextButtonStyle textButtonStyle;
        private TextButton.TextButtonStyle style;
        static
        {
            textButtonStyle = new TextButton.TextButtonStyle();
            textButtonStyle.font = Globals.FONT_HOBO_STD;

            Pixmap p = new Pixmap(1,1, Pixmap.Format.RGB888);
            p.setColor(0.1f,0.2f,0.2f, 0.5f);
            p.fill();
            textButtonStyle.up = new TextureRegionDrawable(new TextureRegion(new Texture(p)));

            p.setColor(0.3f,0.5f,0.8f, 0.5f);
            p.fill();
            textButtonStyle.over = new TextureRegionDrawable(new TextureRegion(new Texture(p)));

            p.setColor(1f,0.5f,0.8f, 1f);
            p.fill();
            textButtonStyle.down = new TextureRegionDrawable(new TextureRegion(new Texture(p)));

        }
        public MyTextButton(String text) {
            super(text, textButtonStyle);
            init();
        }


        public void setTexture(Texture texture) {
            style = new TextButton.TextButtonStyle();
            style.up = new TextureRegionDrawable(new TextureRegion(texture));
            style.over = new TextureRegionDrawable(new TextureRegion(texture));
            style.down = new TextureRegionDrawable(new TextureRegion(texture));
            style.font = Globals.FONT_HOBO_STD;
            this.setStyle(style);
        }

        protected void init() {

        }
    }
