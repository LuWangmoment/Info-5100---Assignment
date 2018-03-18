package midterm;

public class Solution {
	public int findLongestLength(int[] nums){
		int n = nums.length;
		int max=1,len=1;
		for(int i=1;i<n;i++) {
			if (nums[i]>nums[i-1]) {
				len=len+1;
			}
			else {
				if(len>max) {max=len;}
				len=1;
			}
			
		}
		if( max<len) {max=len;}
		return max;
		
}
	public static void main(String args[]) {
		int arr[]= {1,3,5,4,7};
		Solution sl=new Solution();
		System.out.println(sl.findLongestLength(arr));
	}
	
}