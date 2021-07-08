/**
 * 
 */
package RoadMap.Arrays;
import java.util.*;

import static java.lang.System.out;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Array_basic {

	public Array_basic() {
		
		
	}
   
	public static void main(String ...strings) {
		
		out.println("Array Demo !");
		
		int arr[]=new int[]{1,2,3,4,5};
		
		out.println(arr.length);
		//out.println(Arrays.toString(arr));
		StringBuilder strb=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			strb.append(arr[i]+" ");
		}
		System.out.println(strb);
		Arrays.asList(arr);
		
		
				
		
		//Collections ar[]=new Collections[3];
		
		
	}
	
}

