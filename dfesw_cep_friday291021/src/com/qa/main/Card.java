package com.qa.main;

public class Card {
 SUITES mySuit;
 Rank myRank;
 public Card() {
	 int rand =(int)( Math.random()*14);
		int randS = (int)(Math.random()*4);
		//System.out.println(rand);
		//System.out.println(randS);
		Rank[] rankArray = Rank.values();
		this.myRank = rankArray[rand];		
		SUITES[] SUITESArray = SUITES.values();
		this.mySuit = SUITESArray[randS];
		System.out.println(this.myRank.toString() + " of " + this.mySuit.toString());
 }
 
 
 public Card(SUITES suit, Rank rank) {
	 this.mySuit = suit;
	 this.myRank = rank;
 }
 
 void checkIdentity() {
	 
 }
 


}
