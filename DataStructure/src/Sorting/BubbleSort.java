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
public class BubbleSort {

	
   
	
	public static void main(String ...strings) 
	{
		int a[]={15,16,6,8,5};
		System.out.println("Arrays before Sorting : "+Arrays.toString(a));
		int size=a.length;
		for(int i=0;i<size-1;i++) {
			
			for(int j=0;j<(size-1-i);j++) { //no need to compare till size-1 because the end elements r sorted
				
				if(a[j] >a[j+1]) { //comparing j with j+1 element
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
				
		}
		System.out.println("Arrays after  Sorting : "+Arrays.toString(a));
		
		//optismed version of Bubble Sort
		int num[]= {1,2,3,4,5};
		int n=num.length;
		
		System.out.println("Arrays before Sorting : "+Arrays.toString(num));
		for(int i=0;i<n-1;i++) 
		{ 
			boolean swap=false;
			
			for(int j=0;j<(n-1-i);j++) {
				
				if(num[j]>num[j+1]) {
					
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=num[j];
					swap=true;
				}
				
				
				
			}
			if(!swap) { 
				break;  //if in a interation or pass if the elements is not swapped even one time that means its
				//sorted array
			}
			
			
		}
		System.out.println("Arrays after  Sorting : "+Arrays.toString(num));
		
	}
}
