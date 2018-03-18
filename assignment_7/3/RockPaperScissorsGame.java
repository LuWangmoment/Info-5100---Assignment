package assignment7;


class Tool {
protected int strength;
protected char type;
public void setStrength(int strength) {
	this.strength=strength;
}

}
class Rock extends Tool{
	public Rock(int strength) {
		this.strength=strength;
		this.type='r';
	}
	public boolean fight(Tool target) {
		if(target.type=='p') {return (this.strength/2)>(target.strength);}
	
		else{return(this.strength*2)>(target.strength);}
}
}
class Paper extends Tool{
	public Paper(int strength) {
		this.strength=strength;
		this.type='p';
	}
	public boolean fight(Tool target) {
		if(target.type=='r') {return (this.strength/2)>(target.strength);}
	
		else{return(this.strength*2)>(target.strength);}
}
}
class Scissors extends Tool{
	public Scissors(int strength) {
		this.strength=strength;
		this.type='s';
	}
	public boolean fight(Tool target) {
		if(target.type=='r') {return (this.strength/2)>(target.strength);}
	
		else{return(this.strength*2)>(target.strength);}
}
}
public class RockPaperScissorsGame{
public static void main(String args[]){
Scissors s = new Scissors(5);
Paper p = new Paper(7);
Rock r = new Rock(15);
System.out.println(s.fight(p) + " , "+
p.fight(s) );
System.out.println(p.fight(r) + " , "+
r.fight(p) );
System.out.println(r.fight(s) + " , "+
s.fight(r) );
}
}

