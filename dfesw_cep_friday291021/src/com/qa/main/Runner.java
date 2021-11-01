package com.qa.main;

import java.util.ArrayList;

public class Runner {
public static void main(String[] args) {
	
	Dealer fred = new Dealer();
	ArrayList<Card> hand = fred.dealCard();
	for(Card card:hand) {
		System.out.println(card.myRank + " of " + card.mySuit);
	};
	System.out.println(hand.size());
	
	
	
}
}
