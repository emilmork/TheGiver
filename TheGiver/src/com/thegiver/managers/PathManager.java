package com.thegiver.managers;

import java.util.ArrayList;

import com.thegiver.models.basic.PathContainer;

public class PathManager {
	public PathContainer pathcontainer;
	
	public PathManager(){
	}

	public PathContainer getPathcontainer() {
		if(pathcontainer==null){
			pathcontainer = NetworkManager.getInstance().getPathContainer();
			return pathcontainer;
		}else{
			return pathcontainer;
		}
	}

}
