package hu.tokingame.elso;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by M on 10/7/2016.
 */

public class Assets {

    public static AssetManager manager;

    public static final AssetDescriptor<Texture> MENU_BACKGROUDN = new AssetDescriptor<Texture>("wood.png", Texture.class);


    public static void prepare() {
        manager = new AssetManager();
        Texture.setAssetManager(manager);
    }

    public static void load(){
        manager.load(MENU_BACKGROUDN);
    }

    public static void afterLoaded(){

    }

    public static void unload(){
        manager.dispose();
    }

}
