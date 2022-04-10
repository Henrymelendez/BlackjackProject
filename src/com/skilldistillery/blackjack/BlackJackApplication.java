package com.skilldistillery.blackjack;

import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Dealer;
import com.skilldistillery.blackjack.cards.Player;

public class BlackJackApplication {

	public static void main(String[] args) {
		BlackJackApplication app = new BlackJackApplication();
		app.run();

	}

	public void run() {

		Player player = new Player();
		Dealer dealer = new Dealer();
		Scanner sc = new Scanner(System.in);

		dealer.shuffleCards();
		boolean keepGoing = true;

		player.getCardHand(dealer.dealACard());
		player.getCardHand(dealer.dealACard());
		dealer.addACard(dealer.dealACard());
		dealer.addACard(dealer.dealACard());

		while (!player.playerBustLose() || !dealer.dealerBustLose()) {
			System.out.println("Your Hand: ");
			player.printHand();
			System.out.println("the value for your hands is " + player.getValue());
			System.out.println();
			System.out.println("The Dealer: ");
			dealer.showHand();
			System.out.println("The value of the dealer hand is " + dealer.showHandValue());
			System.out.println("There are " + dealer.remainingCards() + " cards left");
			System.out.println();

			System.out.println("Do you want to hit or Stand:");
			System.out.println("1. Hit");
			System.out.println("2. Stand");
			int input = sc.nextInt();
			
			
			

			while (dealer.showHandValue() <= 17) {
				dealer.addACard(dealer.dealACard());
				System.out.println("Dealer :");
				dealer.showHand();
				dealer.showHandValue();
			}

		}

	}

}
