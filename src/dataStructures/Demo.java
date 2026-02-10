package dataStructures;

public class Demo {
	
	public static int linearSearch(int[] nums, int target) {
		int steps = 0;
		for(int i=0;i<nums.length;i++) {
			steps++;
			if(nums[i] == target) {
				System.out.println("steps taken by linearSearch to find the target:" + steps);
				return i;
			}
		}
		System.out.println("steps taken by linearSearch to find the target:" + steps);
		return -1;
	}
	
	public static int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int steps = 0;
		
		while(left <= right) {
			steps++;
			int mid = (left + right)/2;
			
			if(nums[mid] == target) {
				System.out.println("steps taken by binarySearch to find the target:" + steps);
				return mid;
			}
			else if(nums[mid] < target) {
				left = mid + 1;
			}
			else {
				right  = mid - 1;
			}
		}
		System.out.println("steps taken by binarySearch to find the target:" + steps);
		return -1;
		
	}
	
	public static void main(String[] args) {
	
	//lets not specify values, will take an array that have 1000 values in it. linear takes 1000 steps and binary takes 10 steps.
		int[] nums = new int[1000];
		int target = 7;
		
		int result1 = linearSearch(nums, target);
		int result2 = binarySearch(nums, target);
		
		
	}

}
