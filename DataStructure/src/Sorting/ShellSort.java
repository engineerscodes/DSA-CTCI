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

class ShellSort
{
	
  public static void main(String ...strings) 
  {
       int a[]= {23,29,15,19,31,7,9,5,2};
       System.out.println("Array before Sorting : "+Arrays.toString(a));
       int size=a.length;
       for(int gap=size/2;gap>0;gap/=2) 
       {

             
    	    for(int j=gap;j<size;j++) {
    	    	
    	    	for(int i=j-gap;i>=0;i-=gap) {
    	    		
    	    		if(a[i+gap]<a[i]) {
    	    			//swaping elements 
    	    			int temp=a[i];
    	    			a[i]=a[i+gap];
    	    			a[i+gap]=temp;
    	    		}else {
    	    			break;
    	    		}
    	    		
    	    	}
    	    	
    	    }
    	    
       }
       System.out.println("Array After Sorting  : "+Arrays.toString(a));
	 
  }
	
}

