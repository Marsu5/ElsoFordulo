package hu.tokingame.elso;


        import com.badlogic.gdx.graphics.Color;
        import com.badlogic.gdx.graphics.Pixmap;
        import com.badlogic.gdx.scenes.scene2d.ui.Label;
        import com.badlogic.gdx.scenes.scene2d.ui.Skin;
        import com.badlogic.gdx.utils.Align;
/**
 * Created by davim on 2016. 10. 21..
 */

public class MyLabel extends Label {
    float elapsedtime =0;
    public static com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle style;
    public static com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle style2;

    static {
        style = new com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle();
        style.font = Globals.FONT_HOBO_STD;
        style.fontColor = Color.WHITE;


        style2 = new com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle();
        style2.font = Globals.FONT_DIGITAL_7;
        style2.fontColor = Color.WHITE;

    }

    public MyLabel(String text) {
        super(text, style);
        setAlignment(Align.center);
    }


    public MyLabel(CharSequence text, LabelStyle style) {
        super(text, style);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }
}
