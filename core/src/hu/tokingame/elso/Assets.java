package hu.tokingame.elso;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by M on 10/7/2016.
 */

public class Assets {

    public static AssetManager manager;



    public static void prepare() {
        manager = new AssetManager();
        Texture.setAssetManager(manager);
    }

    public static void load(){

    }

    public static void afterLoaded(){

    }

    public static void unload(){
        manager.dispose();
    }

}
