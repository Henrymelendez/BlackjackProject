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
		boolean keepGoing =true;
		dealer.shuffleCards();
	

		player.getCardHand(dealer.dealACard());
		player.getCardHand(dealer.dealACard());
		dealer.addACard(dealer.dealACard());
		dealer.addACard(dealer.dealACard());
		

		
			
			boolean dealerturn = true;
			
			if(player.playerBlackjack()) {
				player.printHand();
				System.out.println("You Won BlackJack");
				
			}
			else if(dealer.dealerWin()) {
				player.printHand();
				
				System.out.println("You Lose Dealer Hit a BlackJack");
				dealer.showHand();
				System.out.println();
				
			}
			
			while (keepGoing) {
				
			
		
			player.printHand();
			System.out.println();
			dealer.showHand();
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
				
			
			 
			if(input == 2 ) {
			
				while (dealerturn) {
					
				
				while(dealer.showHandValue() < 17) {
					System.out.println("Dealer Hits!");
					dealer.addACard(dealer.dealACard());
					
					dealer.showHand();
			
					System.out.println();
				}
				 	dealerturn = false;
					keepGoing = false;
				
				} 
			
			}
			}
				
				
			
			
				
			
			
			if(player.getValue() > dealer.showHandValue() && player.getValue() <= 21 || dealer.showHandValue() > 21 ) {
				player.printHand();
				System.out.println("You win");
				System.out.println();
				dealer.showHand();
				
			}else if (player.getValue() == dealer.showHandValue()) {
				System.out.println("Tie clearing hands");
				player.clearHand();
				dealer.dealerClearHand();
				
			}
			else if(dealer.showHandValue() > 21) {
				System.out.println("dealer hit a bust you win");
				dealer.showHand();
			}
			else if(player.getValue() > 21) {
				System.out.println("You Hit Bust you lose!!");
				player.printHand();
				
			}
			
			
				}
			
		


	

		
		

}
