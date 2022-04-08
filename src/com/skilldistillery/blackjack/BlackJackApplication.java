package com.skilldistillery.blackjack;

import java.util.Scanner;
import java.util.concurrent.Delayed;

import com.skilldistillery.blackjack.cards.Dealer;

public class BlackJackApplication {

	public static void main(String[] args) {
		BlackJackApplication app = new BlackJackApplication();
		app.run();

	}
	
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		Dealer dealer = new Dealer();
		boolean keepGoing = true;
		
		while(keepGoing) {
			
			System.out.println("Do you want to hit or Stand:");
			
			try {
				String input = sc.nextLine();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
