package hu.tokingame.elso;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * Created by M on 10/7/2016.
 */

public class Assets {

    public static AssetManager manager;

    public static final AssetDescriptor<Texture> MENU_BACKGROUDN = new AssetDescriptor<Texture>("wood.png", Texture.class);
    public static final AssetDescriptor<Texture> CHECKBOX = new AssetDescriptor<Texture>("check.png",Texture.class);
    public static final AssetDescriptor<Texture> CHECKBOX_CHECKED = new AssetDescriptor<Texture>("checked.png",Texture.class);
    public static final AssetDescriptor<Texture> SETTINGS_ICON = new AssetDescriptor<Texture>("gear.png", Texture.class);
    public static final AssetDescriptor<Texture> PLAY_BUTTON = new AssetDescriptor<Texture>("play.png", Texture.class);
    public static final AssetDescriptor<Texture> MUSIC_ON = new AssetDescriptor<Texture>("sound.png", Texture.class);
    public static final AssetDescriptor<Texture> MUSIC_OFF = new AssetDescriptor<Texture>("sound-off.png", Texture.class);
    public static final AssetDescriptor<Texture> LOGO = new AssetDescriptor<Texture>("tokin-logo.png", Texture.class);
    public static final AssetDescriptor<Texture> MAIN_BACKGROUND = new AssetDescriptor<Texture>("background.png", Texture.class);

    public static void prepare() {
        manager = new AssetManager();
        Texture.setAssetManager(manager);
    }

    public static void load(){
        manager.load(MENU_BACKGROUDN);
        manager.load(CHECKBOX);
        manager.load(CHECKBOX_CHECKED);
        manager.load(SETTINGS_ICON);
        manager.load(PLAY_BUTTON);
        manager.load(MUSIC_ON);
        manager.load(MUSIC_OFF);
        manager.load(LOGO);
        manager.load(MAIN_BACKGROUND);
    }

    public static void afterLoaded(){

    }

    public static void unload(){
        manager.dispose();
    }

}
