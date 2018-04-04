package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class blackjack1 {
	public static void main(String[] args) {
		Dealer dealer = new Dealer();
		Trick trick;
		Deck deck=new Deck();
		Player player;
		Scanner reader = new Scanner(System.in);
		 System.out.println("please enter the bankroll:");
		 int bankroll = reader.nextInt();
		 System.out.println("The bankroll is: "+ bankroll);
		 System.out.println("please enter the tricks:");
		 int tricks=reader.nextInt();
		 System.out.println("The tricks is: "+tricks);
		 System.out.println("please enter the minimumWager:");
		 int minimumWager=reader.nextInt();
		 System.out.println("The minimumWager is: "+minimumWager);
		 System.out.println("please enter the simpleCounting:");
		 String simpleCounting=reader.next();
		 System.out.println("The simpleCounting is: "+simpleCounting);
		 deck.shuffle(7);
		 if(simpleCounting=="simple") {
			player=new SimplePlayer(bankroll,minimumWager);
		
		 }
		 else {
			 player=new CountingPlayer(bankroll,minimumWager);
		
		 }
		 trick=new Trick();
		 trick.deck=deck;
		 Hand hand1=new Hand();
		 Hand hand2=new Hand();
		 player.hand=hand1;
		 dealer.hand=hand2;
		 trick.player=player;
		 trick.dealer=dealer;
		 int thistrick=1;
		 trick.player.hand=new Hand();
		 while(bankroll>=minimumWager&&thistrick<=tricks) {
			 System.out.println( "Trick =" + thistrick + " bankroll=" + bankroll);
			 if(deck.getCurrentSize()<20) {deck.reset();deck.shuffle(7);}
			 Scanner s = new Scanner(System.in);
			 System.out.println("Please enter wager");
			 int wager=s.nextInt();
			 trick.bet=wager;
			 System.out.println("Player bets "+wager);
			 trick.DealFour();
//			 System.out.println(dealer.holeCard);
//			 System.out.println("player total: "+player.hand.sum);
//			 System.out.println("dealer total: "+dealer.hand.sum);
//			 System.out.println("Dear upCard: "+dealer.upCard);
//			 System.out.println("player numOf A: "+player.hand.numOfA);
//			 System.out.println("dealer numOf A: "+dealer.hand.numOfA);
			 while(player.draw(dealer.upCard)==true) {
				 Card a=deck.deal();
				 System.out.println("Player dealt"+a);
				 player.hand.sum+=a.getSpot().getValue();
				 if(a.getSpot().getValue()==1) {player.hand.numOfA+=1;}
				 if(player.hand.hardOrSoft==true&&player.hand.sum>21) {
					 player.hand.sum-=10;
					 player.hand.hardOrSoft=false;
				 }
				 if((player.hand.numOfA!=0)&&(player.hand.hardOrSoft==false)&&(player.hand.sum<=11)) {
					 player.hand.sum+=10;
					 player.hand.hardOrSoft=true;
				 }
			 }
			 System.out.println("Player's total is "+player.hand.sum);
			 if((player.hand.sum==21)&&(player.hand.hardOrSoft==true)) {
				 System.out.println("Player dealt natural 21");
				 bankroll+=Math.floor(wager*3/2);
				 thistrick++;
			 }
			 if(player.hand.sum>21) {
				 System.out.println("Player bursts");
				 bankroll-=wager;
				 thistrick++;
			 }
			 if(player.hand.sum<21) {
				 System.out.println("Dealer's hole card is"+dealer.holeCard);
				 while(dealer.draw()==true) {
					 Card a=deck.deal();
					 System.out.println("Dealer dealt"+a);
					 dealer.hand.sum+=a.getSpot().getValue();
					 if(a.getSpot().getValue()==1) {dealer.hand.numOfA+=1;}
					 if(dealer.hand.hardOrSoft==true&&dealer.hand.sum>21) {
						 dealer.hand.sum-=10;
						 dealer.hand.hardOrSoft=false;
					 }
					 if((dealer.hand.numOfA!=0)&&(dealer.hand.hardOrSoft==false)&&(dealer.hand.sum<=11)) {
						 dealer.hand.sum+=10;
						 dealer.hand.hardOrSoft=true;
					 }
					 
				 }
				 System.out.println("Dealer's total is "+dealer.hand.sum);
				 if(dealer.hand.sum>21) {
					 System.out.println("Dealer bursts");
					 bankroll+=wager;
					 thistrick++;
				 }
				 else{
					 if(player.hand.sum<dealer.hand.sum) {
						 System.out.println("Dealer wins");
						 bankroll-=wager;
						 thistrick++;
					 }
					 else if(player.hand.sum>dealer.hand.sum) {
						 System.out.println("Player wins");
						 bankroll+=wager;
						 thistrick++;
					 }
					 else {
						 System.out.println("Push");
						 thistrick++;
					 }
						 }
			 }
			 
	}
		 int finaltrick =thistrick-1;
		 System.out.println("Player has "+bankroll+" after "+finaltrick+" tricks ");
	
}
}