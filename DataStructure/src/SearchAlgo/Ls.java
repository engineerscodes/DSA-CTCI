/**
 * 
 */
package SearchAlgo;
import java.util.*;
import static java.lang.System.out;
/**
 * @author M.NAVEEN
 * RANDOM CODER'S
 *
 */
//Linear Search 
// worst case o(n),best o(1)
public class Ls {

	 static  int arr[]= {1,2,4,5,66,7,888,9,882};
    
    public static boolean ls(int n) {
    	
    	for(int i=0;i<arr.length;i++) {
    		 
    		if(arr[i]==n) {
    			return true;
    		}
    		
    	}
    	
    	return false;
    }
  
	public static void main(String ...strings) 
	{   
		out.println("Enter the Element to Search :");
		int n=new Scanner(System.in).nextInt();
		boolean temp=ls(n);
		if(temp)
			out.println("Element "+n+" is Present in array");
		else
			out.println("Element "+n+" Not is Present in array");
	}
	
}
