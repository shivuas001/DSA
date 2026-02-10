package dataStructures;

//BinarySearch using Recursive funtion.
public class Demo {
	
	public static int binarySearch(int[] nums, int target, int left, int right) {
		
	//no need of loop as it is recursive we calling method again and again 
		if(left <= right) {
			int mid = (left + right)/2;
			
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] < target) {
				return binarySearch(nums, target, left=mid+1, right); //calling method again and again
			}
			else {
				return binarySearch(nums, target, left, right=mid-1);
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int[] nums = {3, 5, 7, 9, 11};
		int target = 9;
		
		int result = binarySearch(nums, target, 0, nums.length-1);
		
		System.out.println(result);
		
	}

}
