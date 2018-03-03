// the logic is not work in some cases like: the input "[{}]"
//this is what I suggest you to do 
// public class IsValidBrackets {
//     public static boolean isValidBrackets(String s) {
//         Stack<Character> stack = new Stack<>();
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (c == '(') {
//                 stack.push(')');
//             } else if (c == '[') {
//                 stack.push(']');
//             } else if (c == '{') {
//                 stack.push('}');
//             } else if (stack.isEmpty() || stack.peek() != c) {
//                 return false;
//             } else {
//                 stack.pop();
//             }
//         }
//         return stack.isEmpty();
//     }

//     public static void main(String[] args) {
//         System.out.println(isValidBrackets("([]){}"));
//     }
// }
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

