package gramma;

public class question4 {

	public static String Hint(String Secret,String Number) {
		int bulls=0;
		int cows =0;
		int[] numbers= new int[10];
		for(int i=0;i<Secret.length();i++) {
			if (Secret.charAt(i)==Number.charAt(i)) {
				bulls++;
				
			}
			else {
				if (numbers[Secret.charAt(i)-'0']++ < 0) {cows++;}
	            if (numbers[Number.charAt(i)-'0']-- > 0) {cows++;}
			}
			
		}
		return bulls+" bulls "+cows+" cows";
	}
	public static void main(String args[]) {
		String Secret="1123";
		String Number="0111";
		System.out.println(Hint(Secret,Number));
	}
}
