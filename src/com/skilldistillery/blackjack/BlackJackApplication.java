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
			System.out.println();
			
			
			if(input == 1) {
				player.getCardHand(dealer.dealACard());
			} else {
				System.out.println("Player Stays");
				System.out.println();
				
			}
			if(input == 2) {
				
				while (dealer.showHandValue() <= 17) {
					System.out.println("Dealer Hits!");
					dealer.addACard(dealer.dealACard());
					System.out.println("Dealer :");
					dealer.showHand();
					dealer.showHandValue();
					System.out.println();
				}
			} else {
				
				System.out.println("Dealer Stays.");
				System.out.println();
				
			}
			
			if(player.getValue() > dealer.showHandValue() && player.getValue() <= 21 || dealer.showHandValue() > 21) {
				System.out.println("You win");
				System.out.println();
				break;
			}else if (player.getValue() == dealer.showHandValue()) {
				player.clearHand();
				dealer.dealerClearHand();
				
			}
			else {
				System.out.println("You Lose!! Dealer wins");
				System.out.println();
				break;
			}
			
			
			


		}

	}

}
