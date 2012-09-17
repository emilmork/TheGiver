package com.thegiver.data;

import java.util.ArrayList;

import com.thegiver.models.basic.Card;

public class Storage {
	private static Storage storage;
	
	
	private Storage(){
	}
	
	public static Storage getInstance(){
		if(storage==null){
			storage = new Storage();
			return storage;
		}else{
			return storage;
		}
	}
	
	public ArrayList<Card>getAllCards(){
		return null;
	}
	
	public Card getCard(int id){
		return null;
	}

}
