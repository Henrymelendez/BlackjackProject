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
	public boolean playerBlackjack() {
		if(playerHand.isBlackjack()) {
			
			return true;
		}
		return false;
	}
	
	public boolean playerBustLose() {
		if(playerHand.isBust()) {
			
			return true;
		} else {
			
			return false;
		}
	}
	
	public void clearHand() {
		
		playerHand.clear();
	}
	
	
	
	public void printHand() {
		System.out.println("Player:");
		for (Card cards : playerHand.cards) {
			System.out.println(cards);
		}
		System.out.println();
	}
	

	
	
	
	

}
