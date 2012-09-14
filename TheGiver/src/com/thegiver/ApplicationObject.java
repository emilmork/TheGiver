package com.thegiver;
import com.thegiver.managers.NetworkManager;

import android.app.Application;

public class ApplicationObject extends Application {
	public NetworkManager nm;

	
	@Override
	public void onCreate() {
		super.onCreate();
		nm = new NetworkManager();
	}
}
