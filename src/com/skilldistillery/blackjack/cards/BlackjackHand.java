package com.skilldistillery.blackjack.cards;

import java.util.List;

public class BlackjackHand extends Hand {
	private int total;

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
		for (Card card : cards) {
			total += card.getValue();
		}
		if(total == 21) {
			return true;
		}
		else {
			total = 0;
			return false;
		}
	}

	public boolean isBust() {
		for (Card card : cards) {
			total += card.getValue();
		}
		if(total > 21 ) {
			return true;
		} else {
			total = 0;
			return false;
		}
	}

}
