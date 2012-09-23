package com.thegiver.models.basic;

import com.thegiver.models.graphic.GraphicalObject;

public class Item extends GraphicalObject {
	String path;
	String name;
	
	public Item(String path, String name){
		this.path = path;
		this.name = name;
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
