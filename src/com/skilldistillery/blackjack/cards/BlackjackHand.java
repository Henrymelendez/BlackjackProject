package com.skilldistillery.blackjack.cards;



public class BlackjackHand extends Hand {
	

	public BlackjackHand() {

	}

	@Override
	public int getHandValue() {
		int total = 0;
		for (Card card : cards) {
			total += card.getValue();
		}
		return total;
	}

	public boolean isBlackjack() {
		int total =0;
		for (Card card : cards) {
			total += card.getValue();
		}
		if(total == 21) {
			return true;
		}
		else {
			
			return false;
		}
	}

	public boolean isBust() {
		int total = 0;
		for (Card card : cards) {
			total += card.getValue();
		}
		if(total > 21 ) {
			return true;
		} else {
			
			return false;
		}
	}

}
