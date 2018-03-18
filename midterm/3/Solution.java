package midterm3;

public class Solution {
	public void rotatedArray(int nums[], int d, int n){
		d %= n;
		reverseArray(0,d-1,nums);
		reverseArray(d, n-1, nums);
		reverseArray(0, n-1, nums);
	}
	
	public void reverseArray(int start,int end,int nums[]) {
		while(start<end) {
			int temp = nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}

}
