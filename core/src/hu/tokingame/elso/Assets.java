package hu.tokingame.elso;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * Created by M on 10/7/2016.
 */

public class Assets {

    public static AssetManager manager;

    static final FreetypeFontLoader.FreeTypeFontLoaderParameter fontParameter = new FreetypeFontLoader.FreeTypeFontLoaderParameter();
    static {
        fontParameter.fontFileName = "calibril.ttf";
        fontParameter.fontParameters.size = 50;
        fontParameter.fontParameters.characters = Globals.CHARS;
        fontParameter.fontParameters.color = Color.WHITE;
    }

    public static final AssetDescriptor<BitmapFont> CALIBRIL_FONT
            = new AssetDescriptor<BitmapFont>("calibril.ttf", BitmapFont.class, fontParameter);

    static final FreetypeFontLoader.FreeTypeFontLoaderParameter fontParameter2 = new FreetypeFontLoader.FreeTypeFontLoaderParameter();
    static {
        fontParameter2.fontFileName = "digital-7.ttf";
        fontParameter2.fontParameters.size = 50;
        fontParameter2.fontParameters.characters = Globals.CHARS;
    }

    public static final AssetDescriptor<BitmapFont> DIGITAL_7_FONT
            = new AssetDescriptor<BitmapFont>("digital-7.ttf", BitmapFont.class, fontParameter2);


    public static final AssetDescriptor<Texture> MENU_BACKGROUDN = new AssetDescriptor<Texture>("wood.png", Texture.class);
    public static final AssetDescriptor<Texture> CHECKBOX = new AssetDescriptor<Texture>("check.png",Texture.class);
    public static final AssetDescriptor<Texture> CHECKBOX_CHECKED = new AssetDescriptor<Texture>("checked.png",Texture.class);
    public static final AssetDescriptor<Texture> SETTINGS_ICON = new AssetDescriptor<Texture>("gear.png", Texture.class);
    public static final AssetDescriptor<Texture> PLAY_BUTTON = new AssetDescriptor<Texture>("play.png", Texture.class);
    public static final AssetDescriptor<Texture> MUSIC_ON = new AssetDescriptor<Texture>("sound.png", Texture.class);
    public static final AssetDescriptor<Texture> MUSIC_OFF = new AssetDescriptor<Texture>("sound-off.png", Texture.class);
    public static final AssetDescriptor<Texture> LOGO = new AssetDescriptor<Texture>("tokin-logo.png", Texture.class);
    public static final AssetDescriptor<Texture> MAIN_BACKGROUND = new AssetDescriptor<Texture>("background.png", Texture.class);
    public static final AssetDescriptor<Music> MUSIC = new AssetDescriptor<Music>("Puzzle-Solving.mp3", Music.class);

    public static void prepare() {
        manager = new AssetManager();
        Texture.setAssetManager(manager);
    }

    public static void load(){
        FileHandleResolver resolver = new InternalFileHandleResolver();
        //FileHandleResolver resolver = manager.getFileHandleResolver();
        manager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(resolver));
        manager.setLoader(BitmapFont.class, ".ttf", new FreetypeFontLoader(resolver));
        manager.setLoader(BitmapFont.class, ".otf", new FreetypeFontLoader(resolver));


        manager.load(MENU_BACKGROUDN);
        manager.load(CHECKBOX);
        manager.load(CHECKBOX_CHECKED);
        manager.load(SETTINGS_ICON);
        manager.load(PLAY_BUTTON);
        manager.load(MUSIC_ON);
        manager.load(MUSIC_OFF);
        manager.load(LOGO);
        manager.load(MAIN_BACKGROUND);


        manager.load(CALIBRIL_FONT);
        manager.load(DIGITAL_7_FONT);

        manager.load(MUSIC);

    }

    public static void afterLoaded(){
        manager.get(MUSIC).setLooping(true);
        manager.get(MUSIC).play();
    }

    public static void unload(){
        manager.dispose();
    }

}
