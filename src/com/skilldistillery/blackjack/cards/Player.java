package com.skilldistillery.blackjack.cards;


import java.util.List;

public class Player {
	
	private List<Card> card;
	private int total;
	private BlackjackHand playerHand; 
	
	public Player() {
		playerHand = new BlackjackHand();
		
	}
	
	public int getValue() {
		for (Card cards : playerHand.cards) {
			total += cards.getValue();
		}
		return total;
	}
	
	public void getCardHand(Card c) {
		 
		 playerHand.addCard(c);
		 
		
	}
	
	
	
	public void printHand() {
		for (Card cards : playerHand.cards) {
			System.out.println(cards);
		}
		
	}
	
	
	

}
