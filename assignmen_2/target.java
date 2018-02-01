public int[] tarlist(int[] list, int target) {
	for (int m = 0; m<list.length; m++){
		for (int n = m + 1; n<list.length;n++){
			if (list[m]+list[n]==target){
				return new int[]{m,n};
			}
		}
	}
	return null;
}