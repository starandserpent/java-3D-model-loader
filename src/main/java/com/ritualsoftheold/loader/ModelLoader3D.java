package com.ritualsoftheold.loader;

import com.jme3.asset.AssetManager;
import com.jme3.scene.Spatial;
import com.jme3.texture.Texture;

public class ModelLoader3D {

    private static final String MODEL_FORMAT = ".gltf";
    private AssetIO input;

    public ModelLoader3D(AssetManager assetManager){
        input = new AssetIO(assetManager);
    }

    public Spatial getMesh(String assetName){
        Spatial asset = input.loadAsset(assetName + MODEL_FORMAT);
        asset.updateGeometricState();
        return asset;
    }

    public void register(){
        input.register();
    }

    public Texture getTexture(String assetName){
        return input.loadTexture(assetName);
    }
}
