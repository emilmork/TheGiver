package com.thegiver;
import com.thegiver.managers.PathManager;
import com.thegiver.models.basic.Background;
import com.thegiver.models.graphic.GraphicalObject;

import android.app.Application;

public class ApplicationObject extends Application {
	public PathManager pm;
	

	
	@Override
	public void onCreate() {
		super.onCreate();
		pm = new PathManager();
	}
}
