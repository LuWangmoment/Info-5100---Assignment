package com.company;
import java.util.ArrayList;
import java.util.List;
public class GroupOfCards {
	List<Card> cards=new ArrayList();
    GroupOfCards(){
};
    int sum=0;
    
    public boolean hardOrSoft;
    public void setCard(List<Card>cards){
    	this.cards=cards;
    }
    void addCard(Card c){
    	cards.add(c);
    };
    // EFFECTS: adds the card "c" to those presently held.
    		
    void discardAll(List<Card>cards){
    	cards.clear();
    }
    // EFFECTS: discards any cards presently held , restoring the state
    // of the cards to empty.
   
    int getCurrentSize(){
    	return cards.size();
    }
    // EFFECTS: return the length of cards;

    void display(){
    	for(Card item:cards) {
    		System.out.println(item);
    	}
    }
    //EFFECTS: display every card in cards;

    Card deleteCard(){
    	if(getCurrentSize()==0) {
    		System.out.println("empty");
    		return null;
    	}
    	Card a=cards.get(0);
    	return(cards.remove(0));
    	}
    // EFFECTS: delete the top card from the group of cards and return the
    // deleted card value;
   
    public int getSum() {
    		return sum;
    }
    
    public boolean getHardOrSoft() {
    		return hardOrSoft;
    }
}
