package com.thegiver.models;

import java.util.ArrayList;

public class Category {
	String path;
	String name;
	ArrayList<Figure>figures;
	
	public Category(String path, String name,ArrayList<Figure>figures){
		this.path = path;
		this.name = name;
		this.figures = figures;
		
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
