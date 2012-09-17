package com.thegiver.managers;

import java.util.ArrayList;

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
	//TODO get all cards from file or database
	//Need func to download all images from objects
	//Try syncronizing objects first
	public ArrayList<Card> getAllCards(){
		return null;
	}
	
	public Card getCard(int id){
		return null;
	}
	
	

}
