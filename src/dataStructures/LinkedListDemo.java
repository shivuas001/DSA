package dataStructures;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	
	//here we are working with in-build LinkedList Collection which have many in-build methods
	   LinkedList nums = new LinkedList();
	   
	   nums.add(4);
	   nums.add(3);
	//adds element at first
	   nums.addFirst(8);
	 
	//prints element present at first that is head.
	   System.out.println(nums.peek());
	   
	   System.out.print(nums);

	}

}
