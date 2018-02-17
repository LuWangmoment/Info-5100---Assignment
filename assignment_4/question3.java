package gramma;

public class question3 {
	public static int addDigits(int num) {
		int result = num;
		int dinumber = 0;
		while(result>9) {
			num = result;
			result = 0;
			while(num>9) {
				dinumber = num%10;
				num = num/10;
				result += dinumber;
			}
			result+=num;
			
		}
		return result;
	}
	public static void main(String[] args) {
		int num =99;
		System.out.println(addDigits(num));
				
	}


}