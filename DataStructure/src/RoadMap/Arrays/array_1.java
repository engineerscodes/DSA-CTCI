/**
Check if a key is present in every segment of size k in an array
Difficulty Level : Easy
Last Updated : 15 Mar, 2021
Given an array arr[] and size of array is n and one another key x, and give you a segment size k. The task is to find that the key x present in every segment of size k in arr[].
Examples: 

Input : 
arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3} 
x = 3 
k = 3 
Output : Yes 
There are 4 non-overlapping segments of size k in the array, {3, 5, 2}, {4, 9, 3}, {1, 7, 3} and {11, 12, 3}. 3 is present all segments.
Input : 
arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25} 
x = 23 
k = 5 
Output :Yes 
There are three segments and last segment is not full {21, 23, 56, 65, 34}, {54, 76, 32, 23, 45} and {21, 23, 25}. 
23 is present all window.
Input :arr[] = { 5, 8, 7, 12, 14, 3, 9} 
x = 8 
k = 2 
Output : No
 */
package RoadMap.Arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */

public class array_1 {

    private static int nums[] ;
    static Scanner nav=new Scanner(System.in);
	public array_1(int size) {
		nums=new int[size];
		
	}
	
	
	private static boolean input() {
		try {
			for(int i=0;i<nums.length;i++) {
				nums[i]=nav.nextInt();
			}
			return true;
		}
		catch(InputMismatchException e) {
			return false;
		}
	}
	
	
	public static boolean segmentSearch(int k,int x) {
	  
	 try {
		for(int i=0;i<nums.length;) {
			int flag=0; 
			for(int j=i;j<i+k;j++) 
			{
				 if(nums[j]==x) {
                   i=i+k;
                   flag=1;
                   break;
				 }
			}
			if(flag==0) {
				return false;
				}
			
			
		}
		
		return true;}
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 return false;
	 }
		
	}


	public static void main(String ...args) 
	{
		
		System.out.println("Enter the Size of Array !");
		int size=nav.nextInt();
		array_1 obj=new array_1(size);
		System.out.println("Enter  Array Elements !");
		input();
		System.out.println(obj);
		System.out.println("Enter the segment Size and X");
		System.out.println(segmentSearch(nav.nextInt(),nav.nextInt()));
		
		
	}
	
	
	public String toString() {
		
		return Arrays.toString(nums);
		
	}
	

}

