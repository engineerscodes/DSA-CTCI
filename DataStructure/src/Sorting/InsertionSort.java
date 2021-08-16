/**
 * 
 */
package Sorting;
import java.util.*;
/**
 * @author M.NAVEEN
 * RANDOM CODER'S
 *
 */
public class InsertionSort {



	public static void main(String[] args) 
	{
         int a[]= {5,4,10,1,6,-2};
         
         System.out.println("Array Before Sorting : "+Arrays.toString(a));
         
         int size=a.length;
         
         for(int i=1;i<size;i++) {  //because a[0]= sorted sublist and a[1] to a[n-1] unsortedsublist
        	 
        	 int temp=a[i];
        	 
        	 int j=i-1;
        	 
        	 while(j>=0 && temp<a[j] ) {
        		 a[j+1]=a[j];
        		 j--;
        	 }
        	 
        	 a[j+1]=temp;  // placing it at right place
        	 
         }
         System.out.println("Array After Sorting : "+Arrays.toString(a));
     }

	

}
