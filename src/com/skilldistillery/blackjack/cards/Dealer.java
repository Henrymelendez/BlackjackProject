package com.skilldistillery.blackjack.cards;

public class Dealer {
	BlackjackHand dealerHand;
	Deck game;

	public Dealer() {
		dealerHand = new BlackjackHand();
		game = new Deck();

	}

	public Card dealACard() {

		return game.dealCard();

	}

	public void addACard(Card c) {

		dealerHand.addCard(c);
	}

	public int showHandValue() {

		return dealerHand.getHandValue();
	}

	public int remainingCards() {

		return game.checkDeckSize();
	}

	public void shuffleCards() {

		game.shuffle();
	}

	public void showHand() {
		System.out.println("Dealer: ");
		for (Card hand : dealerHand.cards) {
			System.out.println(hand);
		}
		
		System.out.println();

	}
	

	

	
	public void dealerClearHand() {
		
		dealerHand.clear();
	}
	
	
	public void dealerTurn() {
		
		while(dealerHand.getHandValue() < 17) {
			System.out.println("===================");
			System.out.println("Dealer Hits!");
			addACard(dealACard());
			
			
	
			System.out.println();
		}
	}
	
	public void showOne() {
		System.out.println("Dealer: ");
		System.out.println(dealerHand.cards.get(0));
		System.out.println("Dealer hand value " + dealerHand.cards.get(0).getValue());
		
	}

}
