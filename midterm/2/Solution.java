package midterm2;

class Solution {
	 public int[] searchRange(int[] nums, int target) {
	        int[] returnArray={-1,-1};
	        int leftIndex= extremeSearchIndex(nums,target,true);
	        if (leftIndex==nums.length || nums[leftIndex]!=target){return returnArray;}
	        int rightIndex=extremeSearchIndex(nums,target,false)-1;
	        returnArray[0]=leftIndex;
	        returnArray[1]=rightIndex;
	        return returnArray;
	    }
	    public int extremeSearchIndex(int[] nums, int target, boolean left){
	        int l=0,h=nums.length;
	        while(l<h){
	            int m=(l+h)/2;
	           if(nums[m]>target ||(left&&nums[m]==target)){
	               h=m;
	           }
	            else{l=m+1;}
	        }
	        return l;
	    }
}
