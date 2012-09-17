package com.thegiver.managers;

import java.util.ArrayList;

import com.thegiver.data.Storage;
import com.thegiver.models.basic.Card;

public class CardManager {
	public Card current;
	
	public CardManager(){
	}
	
	public void createNewCard(){
		current = new Card();
	}
	
	public Card getCurrentCard(){
		return current;
	}

	public ArrayList<Card> getAllCards(){
		return Storage.getInstance().getAllCards();
	}
	
	public Card getCard(int id){
		return Storage.getInstance().getCard(id);
	}
	
	

}
