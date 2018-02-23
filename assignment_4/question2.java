// total scores: 10 / 10

package gramma;
import java.util.HashMap;
public class question2 {

	public static void main(String args[]) {
		int[] A = {1,4,5,2,2,2,6,8,3,2,1};
		HashMap<Integer,Integer>hmap = new HashMap<Integer,Integer>();
		for (int i=0; i<A.length;i++) {
			hmap.put(i,A[i]);
		}
		System.out.println("In step 1 HashMap contains: "+hmap);
		
		hmap.remove(6);
		hmap.remove(7);
		System.out.println("In step 2 HashMap contains: "+hmap);
		
		boolean rr = hmap.containsValue(4);
		System.out.println("In step 3: does 4 exit in the map? "+rr);
	}
}
