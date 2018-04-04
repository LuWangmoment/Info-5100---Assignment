package com.company;

public  class SimplePlayer extends Player{
	public SimplePlayer(int bankroll, int minimum) {
		super(bankroll,minimum);
	}
	 public int bet() {
	        return 0;
	    }
	 @Override
	    public boolean draw(Card upCard) {
	        if(this.hand.hardOrSoft==false) {
	        	if(this.hand.sum<=11) {
	        		return true;
	        	}
	        	else if(hand.sum==12) {if((upCard.getSpot().getValue()==4)||(upCard.getSpot().getValue()==5)||(upCard.getSpot().getValue()==6)) {return false;}else return true;}
	        	else if(hand.sum>=13&&hand.sum<=16) {if((upCard.getSpot().getValue()<=16)&&(upCard.getSpot().getValue()>=13)) {return false;}else {return true;}}
	        	else {return false;}	
	        	
	        }
	        else {
	        	if(hand.sum<=17) {return true;}
	        	else if(hand.sum==18) {if((upCard.getSpot().getValue()==8)||(upCard.getSpot().getValue()==2)||(upCard.getSpot().getValue()==7)){return false;}else return true;}
	        
	        else {return false;}}
	        
	    }
	 public void expose(Card c) {
 		
 }
	 public void shuffled() {
 	
 }
}
