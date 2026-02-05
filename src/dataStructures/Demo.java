package dataStructures;

public class Demo {
	
	public static int linearSearch(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,4,6,7};
		int target = 6;
		
		int result = linearSearch(nums, target);
		
		if(result != target) {
			System.out.println("Target found at index : " + result);
		}
		else {
			System.out.println("Target not found");
		}
		
	}

}
