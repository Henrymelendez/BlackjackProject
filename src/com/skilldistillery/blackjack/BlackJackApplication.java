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
	
		dealer.addACard(dealer.dealACard());
		dealer.addACard(dealer.dealACard());
		

		player.getCardHand(dealer.dealACard());
		player.getCardHand(dealer.dealACard());
		
			
			
			
			
			
			while (keepGoing) {
				
			
		
		
			player.printHand();
			dealer.showHand();
			System.out.println("There are " + dealer.remainingCards() + " cards left");
			System.out.println();

			System.out.println("Do you want to hit or Stand:");
			System.out.println("1. Hit");
			System.out.println("2. Stand");
			int input = sc.nextInt();
			System.out.println();
			
			
			switch(input) {
				
			case 1:
				
					player.playerTurn(dealer.dealACard());
					if(player.getValue() == 21) {
						player.printHand();
						System.out.println("Black jack you win");
						System.exit(0);
					}
					else {
						if (player.getValue() > 21) {
						System.out.println("you hit a bust you lose!!");
						player.printHand();
						System.exit(0);
						}
					}
					break;
					
			case 2:
				dealer.dealerTurn();
				dealer.showHand();
				
				System.out.println(dealer.showHandValue());
				if(dealer.showHandValue() == 21) {
					System.out.println("Dealer Hit a Blackjack ");
					System.out.println("you Lose!!!");
				}
				else if(dealer.showHandValue() > 21) {
					System.out.println("Dealer hit bust");
					System.out.println("You win !!");
					
					System.exit(0);
					}	
				if(dealer.showHandValue() > 17) {
					win(player, dealer);
					System.exit(0);
				}
				
				break;
			default:
				System.out.println("Please enter a valid input");
				break;
				}
			
				
				} 
			
			}
	
	
	public boolean win(Player p, Dealer d) {
		
		if(p.getValue() > d.showHandValue() && p.getValue() < 21) {
			System.out.println("You win !!!");
			return true;
		}
		
		else if(d.showHandValue() > p.getValue() && d.showHandValue() < 21) {
			System.out.println("You lost dealer won");
			return true;
		}
		return false;
		
		
	}
			
			
				
				
			
			
				
			
			
			
			
			
				}

	
	
	
	
	
		
			
		


	

		
		


