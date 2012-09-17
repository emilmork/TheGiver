package com.thegiver.models.basic;

import java.util.ArrayList;
import java.util.Date;

import com.thegiver.models.graphic.GraphicalObject;

public class Card {
	public ArrayList<GraphicalObject>graphicalObjects;
	public String name;
	public Date date;
	
	public Card(){
		graphicalObjects = new ArrayList<GraphicalObject>();
	}

	public ArrayList<GraphicalObject> getGraphicalObjects() {
		return graphicalObjects;
	}

	public void setGraphicalObjects(ArrayList<GraphicalObject> graphicalObjects) {
		this.graphicalObjects = graphicalObjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
