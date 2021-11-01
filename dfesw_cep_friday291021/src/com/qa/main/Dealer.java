package com.qa.main;

import java.util.ArrayList;

public class Dealer {
 int cardCount =0;
	public Dealer() {
		
	}
	
	ArrayList<Card> dealCard() {
		// new Card created with random suit and rank
		Card firstCard = new Card();
		cardCount ++;
		ArrayList<Card> hand = new ArrayList<>();
		hand.add(firstCard);
		
		
		while(cardCount < 5) {
			Card secondCard = new Card();
			
			if(hand.contains(secondCard) == false) {
				hand.add(secondCard);
				cardCount++;
				}
			
			
			
		}
		return hand;
	
		
		
	
		
			
		
	}
	
	boolean checkTheSame(Card firstCard, Card secondCard) {
		
		if(firstCard.myRank == secondCard.myRank && firstCard.mySuit == secondCard.mySuit){
			System.out.println("they are the same ");
			return true;
		}
		else {
			System.out.println("they are different");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Dealer [cardCount=" + cardCount + "]";
	}
	
	
}
