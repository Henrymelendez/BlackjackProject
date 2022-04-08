package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	
	protected List<Card> cards;
	
	
	public Hand() {
		this.cards = new ArrayList<Card>();
	}
	
	public void addCard(Card card) {
		cards.add(card);
		
	}
	
	public void clear() {
		cards.clear();
		
	}
	
	public abstract int getHandValue();
	
	
	
	
	public String toString() {
		
		return cards.toString();
	}
	

}
