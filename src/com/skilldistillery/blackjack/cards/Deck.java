package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.DebugGraphics;

public class Deck  {

	List<Card> deck;

	public Deck() {
		
		deck = new ArrayList<>();
		createDeck();
	}
	
	





	public void createDeck(){
	
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				deck.add(new Card(suit, rank));
			}
		}
		
		
	}
	
	public int checkDeckSize() {
		
		return deck.size();
	}
	
	public Card dealCard() {
		
		return deck.remove(0);
		
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}

}
