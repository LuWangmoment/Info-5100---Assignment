package assignment7;

public class Example {
void indexCheck(int upperBound,int lowerBound,int index) throws MyIndexOutOfBoundException {
	if(index>upperBound||index<lowerBound) {
		throw new MyIndexOutOfBoundException(lowerBound, upperBound, index);
	}
}
public static void main(String args[]) {
	Example obj = new Example();
	try {
		obj.indexCheck(9, 15, 20);
	}
	catch(MyIndexOutOfBoundException ex)
	{
		System.out.println(ex);
	}
}
}
