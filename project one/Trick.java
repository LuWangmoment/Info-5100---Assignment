package com.company;

import java.util.List;

public class Trick {
	    Deck deck;
	    Player player;
	    Dealer dealer;
	    int bet;

	    Trick(){
	    }
	    
	    
	    void play()throws Exception{
	    	wager();
	    	DealFour();
	    	playerTurn();
	    	dealerTurn();
	    	closeTurn();

	    }
	    // execute the five following steps;

	    void wager(){
	    	
	    }
	    

	    void DealFour()
	    {
	    	player.hand.sum=0;
	    	player.hand.numOfA=0;
	    	dealer.hand.sum=0;
	    	dealer.hand.numOfA=0;
	    	for(int i =1;i<=4;i++) {
	    		Card a=deck.deal();
	    		if(i==1||i==3) {
	    			if(a.getSpot().getValue()==1)
	    			{player.hand.numOfA+=1;}
	    			System.out.println("Player dealt "+a);
	    			player.hand.sum+=a.getSpot().getValue();
	    			
	    		}
	    		if(i==2||i==4) {
	    			if(a.getSpot().getValue()==1)
	    			{dealer.hand.numOfA+=1;}
	    			if(i==2) {
	    			dealer.upCard=a;
	    			System.out.println("Dealer dealt "+a);
	    			dealer.hand.sum+=a.getSpot().getValue();
	    			}
	    			if(i==4) {
	    			dealer.holeCard=a;
	    			dealer.hand.sum+=a.getSpot().getValue();}
	    			
	    		}
	    	}
	    	if((player.hand.numOfA>0)&&(player.hand.sum<=11)) {
	    		player.hand.hardOrSoft=true;
	    		player.hand.sum+=10;
	    	}
	    	else {player.hand.hardOrSoft=false;}
	    	if((dealer.hand.numOfA>0)&&(dealer.hand.sum<=11)) {
	    		dealer.hand.hardOrSoft=true;
	    		dealer.hand.sum+=10;
	    	}
	    	else {dealer.hand.hardOrSoft=false;}
	    }
	    //After the wager, the dealer deals a total of four cards:
	    // the first face-up to the player, the second face-up to
	    // himself, the third face-up to the player, and the fourth
	    // face-down to himself.

	    void playerTurn(){};

	    void dealerTurn(){
	    	
	    }

	    // dealer's turn only happens if the player hasn’t busted or the player is
	    // not dealt a natural 21 .

	    void closeTurn(){
	    	if(dealer.hand.getHandValue().count<player.hand.getHandValue().count) {
	    		player.bankroll+=bet;
	    	}
	    };
	    // compare the count and give back reward to player if win.
}
