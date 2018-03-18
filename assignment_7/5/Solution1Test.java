package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution1Test {

	@Test
	void test() {
		Solution1 sol1 = new Solution1();
		double output=sol1.findMedianSortedArrays(new int[]{1,5},new int[]{2,3});
		assertEquals(2.5, output);
	}

}
