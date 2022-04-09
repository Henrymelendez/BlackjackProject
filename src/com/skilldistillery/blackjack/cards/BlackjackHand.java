package com.skilldistillery.blackjack.cards;

import java.util.List;

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
		if(this.getHandValue()== 21) {
			return true;
		}
		
		return false;
	}
	
	
	
	
	public boolean isBust() {
		if(this.getHandValue() > 21) {
			return true;
		}
		
		return false;
	}
	
	
	

}
