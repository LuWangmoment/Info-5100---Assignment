scores : 10 / 10
package assignment3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class integers {

	public List<List<Integer>> threeSum(int[] element) {
	    Arrays.sort(element);
	    List<List<Integer>> res = new LinkedList<>(); 
	    for (int i = 0; i < element.length-2; i++) {
	        if (i == 0 || (i > 0 && element[i] != element[i-1])) {
	            int low = i+1, hi = element.length-1, sum = 0 - element[i];
	            while (low < hi) {
	                if (element[low] + element[hi] == sum) {
	                    res.add(Arrays.asList(element[i], element[low], element[hi]));
	                    while (low < hi && element[low] == element[low+1]) {
	                    	low++;
	                    }
	                    while (low < hi && element[hi] == element[hi-1]) {
	                    	hi--;
	                    	low++; 
	                    	hi--;
	                    }
	                } else if (element[low] + element[hi] < sum) {
	                low++;
	                }
	                else {
	                	hi--;
	                }
	              }
	           }
	    }
	    return res;
	}

}
