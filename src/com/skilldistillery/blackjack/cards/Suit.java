package com.skilldistillery.blackjack.cards;

public enum Suit {
	HEARTS("Hearts"), 
	SPADES("Spades"),
	CLUBS("Clubs"),
	DIAMONDS("Diamonds");
	
	final private String name;
	
	private Suit(String d) {
		name = d;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	

}
