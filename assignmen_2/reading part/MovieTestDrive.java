package Movie;

public class MovieTestDrive {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title ="Gone with the stock";
		one.genre = "Tragic";
		one.rating = -2;
		Movie two = new Movie();
		two.title = "Lost in Cubicle Space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();
		Movie three = new Movie();
		three.title = "Byte club";
		three.genre ="Tragic but ultimately uplifting";
		three.rating = 127;
	}
}
