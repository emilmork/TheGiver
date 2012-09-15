package com.thegiver.managers;

import com.thegiver.data.Network;
import com.thegiver.models.PathContainer;

public class NetworkManager {
	private static NetworkManager networkmanager;
	
	private NetworkManager(){
	}
	
	public static NetworkManager getInstance(){
		if(networkmanager==null){
			networkmanager = new NetworkManager();
			return networkmanager;
		}else{
			return networkmanager;
		}
	}
	
	public PathContainer getPathContainer(){
		return Network.getInstance().getPathContainer();
	}
	
}
