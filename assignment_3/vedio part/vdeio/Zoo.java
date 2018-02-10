package vdeio;

public class Zoo {
	
	  public static void main(String[] args) {
		
		Animal animal1 = new Animal(12,"M",23);
		animal1.eat();
		
		Chicken chick1 = new Chicken(1,"M",7);
		
		
		Bird bird1 = new Bird(3,"F",10); 
		bird1.eat();
		bird1.sleep();
	}

}
 