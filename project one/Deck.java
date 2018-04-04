package com.company;

import java.util.ArrayList;
import java.util.List;
class DeckEmptyException extends Exception { // An exception type
	String str1;
	public DeckEmptyException(String str2) {
	str1=str2;
	}
	public String toString(){
		return("DeckEmptyExecption Occurred: "+str1);
	}
};
public class Deck extends GroupOfCards {
	final int DeckSize = 52;
    // A standard Deck of 52 playing card---no jokers
    Deck(){
    
    	for(Suit suit:Suit.values()) {
    		for(Spot spot:Spot.values()) 
    			{super.cards.add(new Card(spot, suit));
    			}
    }
    }

    // EFFECTS: constructs a "newly opened" Deck of card.  first the
    // spades from 2-A, then the hearts, then the clubs, then the
    // diamonds.  The first Card dealt should be the 2 of Spades.

    void reset(){
    		new Deck();
    }
    
    // EFFECTS: resets the Deck to the state of a "newly opened" Deck
    // of card:

    void shuffleOnce(int n){
    	List<Card> cardsLLeft= cards.subList(0, n);
    	List<Card> cardsRight= cards.subList(n, cards.size());
    	List<Card> cards1=new ArrayList();
    	if(n==0){cards1=cardsRight;}
    	else if(n==52) cards1=cardsLLeft;
    	else{
    	for(int i=0,j=0;i<cardsLLeft.size()&&j<cardsRight.size();i++,j++) {
    		cards1.add(cardsLLeft.get(i));
    		cards1.add(cardsRight.get(j));}
    	
    	if(n>52-n) {cards1.addAll(cardsLLeft.subList(52-n,n));}
    	if(n<52-n) {cards1.addAll(cardsRight.subList(n, 52-n));}}
    	cards=cards1;
    	}
   

    // REQUIRES: n is between 0 and 52, inclusive.

    // EFFECTS: cut the Deck into two segments: the first n card,
    // called the "left", and the rest called the "right".  Note that
    // either right or left might be empty.  Then, rearrange the Deck
    // to be the first Card of the right, then the first Card of the
    // left, the 2nd of right, the 2nd of left, and so on.  Once one
    // side is exhausted, fill in the remainder of the Deck with the
    // card remaining in the other side.  Finally, make the first
    // Card in this shuffled Deck the next Card to deal.  For example,
    // shuffle(26) on a newly-reset() Deck results in: 2-clubs,
    // 2-spades, 3-clubs, 3-spades ... A-diamonds, A-hearts.

    // Note: if shuffle is called on a Deck that has already had some
    // card dealt, those card should first be restored to the Deck
    // in the order in which they were dealt, preserving the most
    // recent post-shuffled/post-reset state.

    void shuffle(int times){
    	System.out.println("Shuffling the deck");
    	int time=1;
    	while(time<=times) {
    		int cut=(int)Math.floor(Math.random()*27+13);
    		System.out.println("cut at " + cut );
    		shuffleOnce(cut);
    		time++;
    	}
    };
    // REQUIRES: times is the time of using shuffleOnce method to shuffle
    // cards, normally time should be at least 5.

    //EFFECTS: In each time, use Math.random to pick an cut number between
    // 13 - 39, and then call shuffleOnce method with the number;

    Card deal(){
    		
	    return deleteCard();
	    	
    };

    // EFFECTS: returns the next Card to be dealt.  If no card
    // remain, throws an instance of DeckEmptyExecption and then
    // reset the deck

    int cardsLeft(){
    		return cards.size();
    };
    // EFFECTS: returns the number of card in the Deck that have not
    // been dealt since the last reset/shuffle.

}
