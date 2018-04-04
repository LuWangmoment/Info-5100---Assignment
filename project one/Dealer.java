package com.company;

public class Dealer {
	Hand hand;
	Card holeCard;
	Card upCard;
    Dealer(){
   
    };

    public boolean draw(){
        if(this.hand.sum<17) return true;
        else return false;
    }
    // EFFECTS: For dealer The dealer must
    // hit until he either reaches a total greater than or equal to 17
    // (hard or soft), or busts.
}
