/**
 * 
 */
package Sorting;

import java.util.Arrays;

/**
 * @author M.NAVEEN
 * RANDOM CODER'S
 *
 */
public class SelectionSort {

	

	public static void main(String ...strings) {
		
		
		int arr[]= {7,4,10,8,3,1};
		
		int length=arr.length;
		
		for(int i=0;i<=length-2;i++)  //first element to secord last element | the last one is automatically sorted
		{  int minIndex=i;
		   for(int j=i+1;j<length;j++) // i+1 to the end 
		   {
			   if(arr[j]<=arr[minIndex]) { //compare with minindex
				   minIndex=j;
			   }
			   
		   }
		   int temp=arr[i];
		   arr[i]=arr[minIndex];
		   arr[minIndex]=temp;
		}
		
		System.out.print(Arrays.toString(arr));
		
		
	}
}
