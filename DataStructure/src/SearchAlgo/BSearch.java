/**
 * 
 */
package SearchAlgo;
import java.util.*;
/**
 * @author M.NAVEEN
 * RANDOM CODER'S
 *
 */
//  time complexity to O(Log n) 
public class BSearch 
{
    static int arr[];

	public BSearch() 
	{
		arr= new int[]{1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
	}
	
	public void Bfind(int n)
	{
		
	    int last=arr.length-1;
	    int beg=0;
		for(;beg<=last;) {
			int mid=(beg+last)/2;
			if(n<arr[mid]) {
				last=mid-1;
			
			}
			else if(arr[mid]==n) {
				System.out.print("Found it at index :"+mid);
				return ;
			}
			else {
			    beg=mid+1;
			   
			}
			
		}
		System.out.print("Not Found !!!");
	}

	public static void main(String[] args) 
	{
	  BSearch obj= new BSearch() ;
	  obj.Bfind(new Scanner(System.in).nextInt());
	}

}
