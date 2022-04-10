package com.skilldistillery.blackjack.cards;




public class Player {
	
	
	private int total;
	private BlackjackHand playerHand;
	
	
	public Player() {
		playerHand = new BlackjackHand();
		
	}
	
	public int getValue() {
		
		return total;
	}
	
	public void getCardHand(Card c) {
		
		 total += c.getValue();
		 playerHand.addCard(c);
		 
		
	}
	
	
	
	
	public void clearHand() {
		
		playerHand.clear();
	}
	
	
	
	public void printHand() {
		System.out.println("Player:");
		for (Card cards : playerHand.cards) {
			System.out.println(cards);
		}
		System.out.println("Value of player hand is " + getValue());
		System.out.println();
	}
	
	
	public void playerTurn(Card c) {
		
		
		
		getCardHand(c);
	}
	

	
	
	
	

}
