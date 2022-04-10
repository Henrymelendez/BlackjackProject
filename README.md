# Blackjack Application


## Description
A Black game application that would allow a player to play against a computer until either won or lost if either the player or the computer hit a bust or a blackjack the game would end regardless of the move either made , or a tie if for some reason both players decide to stand.



## Technology / Skills Used

* Java  
* Eclipse
* Abstraction
* Ecapsulation
* Inheritance
* Polymorphism
* Enums
* For Each / For loops
* Classes
* Switch cases
* UML
* if / else / else if



## User Stories

##### User Story #1

Create a class structure that mimics a deck of cards. Remember decks as well as hands are made up of cards. Feel free to create the structure in any way you see fit.

Your card and deck implementations should NOT be coupled to Blackjack; you should be able to reuse them to implement a poker or bridge game application.

##### User Story #2
Add methods and fields to your classes that mimic the functionality of shuffling and dealing a deck of cards. Remember that when a card is dealt you have to remove it from the current deck. You should be able to print out a shuffled deck to the terminal.

##### User Story #3
Deal two hands of cards - one to a Dealer and another to a Player. Allow the players to Hit (add cards to their hand) or Stay (not add cards to their hand) in accordance to the rules of blackjack shown in the wiki.

Do not worry about the multiple values for Ace until your basic game logic is working. Assume they are either 1 or 11 to start.

##### User Story #4
The Dealer's decisions are based on game logic in the program.

The Dealer must decide to Hit or Stay based on the rules of Blackjack: if the Dealer's hand total is below 17, the Dealer must Hit; if the hand total is 17 or above, the Dealer must Stay.

##### User Story #5
Determine the winner of each round by implementing the remaining rules of Blackjack (such as going over 21) and comparing hand values.




## Lessons Learned 

The project was tough i had to make a lot of changes as each edge case failed or gave me issues. I had to constantly change win logic how methods worked and how the player, and the dealer interacted with the game I am not a black jack player so i had to do a little learning to apply the logic into code to get the correct output from the logic. another problem area for me was in the switching off between the dealer and the player. The switch off would make the win / loss logic funky which required me to stop and debug code line by line until I found what methods where causing it to fail. This project had me slowing down and looking at my logic and taking breaks to think and write down why it would not work so i could come back with a different game plan. This is the toughest project i have done so far.


