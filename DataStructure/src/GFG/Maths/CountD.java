/**
 * 
 */
package GFG.Maths;
import java.util.*;
import static java.lang.System.out;
/**
 * @author M.NAVEEN
 * RANDOM CODER'S
 *
 */
public class CountD {

	public CountD() {
		
	}
	
    public static void input() {
    	
		try {
			  int n= new Scanner(System.in).nextInt();
			 countchar(n);
		}
		catch(Exception e) {
		     out.println("INVALID NUMBER \nEnter a number : ");
		     input();
		}
		
    }
    
    public  static void countchar(int n) {
      int count=0;
      int reverse=0;
       while(n>0) {
    	   reverse=reverse*10+n%10;
    	   n/=10;
    	   count++;
       }
       out.println("Reverse : "+ reverse);
       out.println("No of Char   : "+count);
    }
	
	
	public static void main(String ...strings) {
	   out.println("Enter a number : ");
	   input();
	}

}
