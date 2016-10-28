package hu.tokingame.elso;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by M on 10/28/2016.
 */

public class HelpStage extends MyStage {
    private MyLabel label;

    public HelpStage(Viewport viewport, Batch batch, Game game) {
        super(viewport, batch, game);
        Gdx.input.setCatchBackKey(true);
        init();
    }


    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.BACK){
            game.setScreen(new MenuScreen(game));
        }
        return false;
    }

    @Override
    protected void init() {

        addActor(new OneSpriteStaticActor(Assets.manager.get(Assets.MENU_BACKGROUDN)){
            @Override
            protected void init() {
                super.init();
                this.setPosition(0,0);
                this.setSize(1280,720);
            }
        });

        addActor(label = new MyLabel("A játék legenerál egy sorozat első öt elemét, a te feladatod kitalálni a hatodikat.\n" +
                "A bevitel a játékképernyő bal oldalán található (Tökin márkájú)\n számológéppel lehetséges.\n" +
                "Gombok:\n" +
                "off gomb: kilépés a főmenübe\n" +
                "fx gomb: kiírja az aktuális sorozathoz felhasznált képletet\n" +
                "del gomb: kitörli a számológép képernyőjének tartalmának legutolsó elemét\n" +
                "a lap sarkán a pörgő nyíl szerű valami: új sorozatot generál\n" +
                "egyenlőség gomb: ezzel lehet bevinni az általad helyesnek vélt eredményt\n" +
                "számgombok: ezekkel lehet beírni számokat\n"));
        label.setPosition(1280/2f-label.getWidth()/2f,720/6f);
        label.setFontScale(0.75f);

        addActor(new MyTextButton("Vissza"){
            @Override
            protected void init() {
                super.init();
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.setScreen(new MenuScreen(game));
                    }
                });
            }
        });

    }





}
