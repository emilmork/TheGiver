package com.thegiver.models;

import java.util.ArrayList;

public class PathContainer {
	ArrayList<Category>categories;
	ArrayList<Item>items;
	ArrayList<Background>backgrounds;
	
	public PathContainer(ArrayList<Category>categories,ArrayList<Item>items,ArrayList<Background>backgrounds){
		this.categories = categories;
		this.items = items;
		this.backgrounds = backgrounds;
	}

	public ArrayList<Category> getCategories() {
		return categories;
	}

	public void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public ArrayList<Background> getBackgrounds() {
		return backgrounds;
	}

	public void setBackgrounds(ArrayList<Background> backgrounds) {
		this.backgrounds = backgrounds;
	}
}
