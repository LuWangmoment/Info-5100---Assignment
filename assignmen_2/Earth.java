
public class Earth {
	
	public static void main(String args[]){
		
		Human tom;
		Human Joe;
		
		tom = new Human();
		Joe = new Human();
		tom.age = 5;
		Joe.age =4;
		tom.eyeColor = "brown";
		Joe.eyeColor = "blue";
		tom.heightInInches = 72;
		Joe.heightInInches =76;
		tom.name = "Tom Zsabo";
		Joe.name = "Joe Smith";
		
		tom.speak();
		Joe.speak();
	}

}
