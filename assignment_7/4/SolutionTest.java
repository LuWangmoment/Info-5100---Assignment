package testing;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution sol = new Solution();
		Interval a= new Interval(1, 3);
		Interval b= new Interval(2, 4);
		
		List<Interval> l1 =new ArrayList<Interval>();
		l1.add(a);
		l1.add(b);
		
		List<Interval> output =sol.merge(l1);
		List<Interval> l2 =new ArrayList<Interval>();
		l2.add(new Interval(1,4));
		
		
		assertEquals(l2, output);
	}

}
