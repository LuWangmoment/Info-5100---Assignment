package gramma;

public class calculator {

	public static int addition(int m, int n) {
		return m + n;
	}

	public static int substraction(int m, int n) {
		return m - n;

	}

	public static int multiplication(int m, int n) {
		return m * n;
	}

	public static float divisor(int m, int n) {
		return m / n;
	}

	public static double squareRoot(int m) {
		return Math.sqrt(m);
	}

	public static double square(int m) {
		return Math.pow(m, 2);
	}

	public static double cube(int m) {
		return Math.pow(m, 3);
	}

	public static double FahrenheitCelsius(int m) {
		return (m - 32) * 5 / 9;
	}

	public static int FeetInches(int m) {
		return m * 12;
	}

	public static void main(String args[]) {
		int m = 2;
		int n = 3;
		System.out.println(calculator.addition(m, n)+":addition");
		System.out.println(calculator.substraction(m,n)+":substraction");
		System.out.println(calculator.multiplication(m,n)+":multiplication");
		System.out.println(calculator.divisor(m,n)+":divisor");
		System.out.println(calculator.squareRoot(m)+":squareRoot");
		System.out.println(calculator.square(m)+":square");
		System.out.println(calculator.cube(m)+":cube");
		System.out.println(calculator.FahrenheitCelsius(m)+":FahrenheitCelsius");
		System.out.println(calculator.FeetInches(m)+":FeetInches");
		
	}
}
