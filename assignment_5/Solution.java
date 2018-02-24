package gramma;
import java.util.HashMap;
public class Solution {
public static boolean isValid(String s) {
	HashMap<String,Integer>hmap = new HashMap<String,Integer>();
	for(int i=0;i<s.length();i++) {
			hmap.put(s.charAt(i) + "",i);
		}
	int val1=hmap.get("{");
	int val2=hmap.get("}");
	int val3=hmap.get("(");
	int val4=hmap.get(")");
	int val5=hmap.get("[");
	int val6=hmap.get("]");
	if (val2==val1+1 && val4==val3+1 && val6==val5 + 1) {
		return true;
	}
	else {
		return false;
	}
	}
public static void main(String args[]) {
	System.out.println(isValid("(){}[]"));
}
}

