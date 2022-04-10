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
			if(player.playerBlackjack()) {
				player.printHand();
				System.out.println("You Won BlackJack");
				break;
			}
			else if(dealer.dealerWin()) {
				player.printHand();
				
				System.out.println("You Lose Dealer Hit a BlackJack");
				dealer.showHand();
				System.out.println();
				break;
			}
			
		
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
				sc.nextLine();
			} else {
				System.out.println("Player Stays");
				System.out.println();
				
			}
			if(dealer.showHandValue() <= 17) {
				
				while (dealer.showHandValue() <= 17) {
					System.out.println("Dealer Hits!");
					dealer.addACard(dealer.dealACard());
					System.out.println("Dealer :");
					dealer.showHand();
					System.out.println(dealer.showHandValue());
					System.out.println();
				}
				
				
			} 
			else {
				continue;
			}
			
			if(player.getValue() > dealer.showHandValue() && player.getValue() <= 21 || dealer.dealerBustLose()) {
				player.printHand();
				System.out.println("You win");
				System.out.println();
				break;
			}else if (player.getValue() == dealer.showHandValue()) {
				player.clearHand();
				dealer.dealerClearHand();
				
			}
			else if(player.playerBustLose()) {
				System.out.println("You Hit Bust you lose!!");
				break;
			}
			else if(dealer.dealerBustLose()) {
				System.out.println("Dealer Hit bust you win");
				break;
			}
			
			
			
			


		}// end of while

	}

}
