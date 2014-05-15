package com.ScottonWise.ZombieBird.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ScottonWise.ZombieBird.ZBGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "ZombieBird";
        config.useGL30 = false;
        config.width = 272;
        config.height = 408;
        new LwjglApplication(new ZBGame(), config);

	}
}
