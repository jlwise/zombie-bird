package com.ScottonWise.ZombieBird;
import com.ScottonWise.Screens.GameScreen;
import com.badlogic.gdx.Game;
import com.ScottonWise.ZBHelpers.AssetLoader;

public class ZBGame extends Game {
    public void create() {
        System.out.println("ZBGame Created!");
        AssetLoader.load();
        setScreen(new GameScreen());
    }

    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
