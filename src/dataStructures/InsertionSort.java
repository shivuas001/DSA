package dataStructures;

public class InsertionSort {

	public static void main(String[] args) {
		int nums[] = {5,6,2,3,1,9,8,4};
		
		for(int i=1;i<nums.length;i++) 
		{
			int key = nums[i];
			int j = i-1;
			
			while(j>=0 && nums[j] > key)
			{
				nums[j+1] = nums[j];
				j--;
			}
			nums[j + 1] = key;
		
		//to print iteration how it is sorting that is steps
			System.out.println();
			for(int num: nums) {
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
		System.out.println("After sorting");
		for(int num: nums) {
			System.out.print(num + " ");
		}

	}

}
