package testing;
import java.util.*;

public class Solution {
	 public List<Interval> merge(List<Interval> intervals) {
	        Collections.sort(intervals, new Comparator<Interval>(){
	            @Override
	            public int compare(Interval obj0, Interval obj1) {
	                return obj0.start - obj1.start;
	            }
	        });

	        List<Interval> ret = new ArrayList<>();
	        Interval prev = null;
	        for (Interval inter : intervals) {
	            if (  prev==null || inter.start>prev.end ) {
	                ret.add(inter);
	                prev = inter;
	            } else if (inter.end>prev.end) {
	                // Modify the element already in list
	                prev.end = inter.end;
	            }
	        }
	        return ret;
	    }
}
class Interval {
    int start;
    int end;
   Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
 }