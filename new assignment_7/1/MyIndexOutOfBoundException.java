package assignment7;

public class MyIndexOutOfBoundException extends Exception{
	int lowerBound;
	int upperBound;
	 int index;

public MyIndexOutOfBoundException(int l,int h, int i) {
	this.lowerBound=l;
	this.upperBound=h;
	this.index=i;
}

public  String toString(){
	return "Error Message: Index: "+index +" , but Lower bound: "+lowerBound+" , upper Bound: "+upperBound ;
}


}
