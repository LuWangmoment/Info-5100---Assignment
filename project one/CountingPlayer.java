package com.company;

public class CountingPlayer extends Player {
	int memoryCard;

    CountingPlayer(int bankroll, int minimum){
        super(bankroll, minimum);
        memoryCard = 0;
    }

    @Override
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

    @Override
    public void expose(Card c) {
    		System.out.println(c);
    }

    @Override
    public void shuffled() {
    		System.out.println("the deck has been re-shuffled.");		
    }
}
