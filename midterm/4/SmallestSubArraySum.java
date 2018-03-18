package midterm4;

class SmallestSubArraySum {
	public static int smallestSubWithSum(int arr[], int n, int x){
		if(arr==null || n==0) {
			return 0;
		}
		int i=0,j=0,min=Integer.MAX_VALUE,sum=0;
		while(j<n) {
			sum+=arr[j++];
			while(sum>x) {
				min=Math.min(min, j-i);
				sum-=arr[i++];
			}
		}
		return min==Integer.MAX_VALUE? 0:min;
	}
	//delete
	public static void main(String args[]) {
		System.out.println(smallestSubWithSum(new int[]{1, 4, 45, 6, 0, 19}, 6, 51));
	}
}
