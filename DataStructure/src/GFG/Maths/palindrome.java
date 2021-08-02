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
public class palindrome {

    public static void input() {
    	try {
    		 int n =new Scanner(System.in).nextInt();
    		 //n=010; //ocatal rep A leading 0 denotes an octal numeric 
    		 //value so the value 010 can be decoded thus: 010 = 1 * 81 + 0 * 80 = 8
    		out.print(" The Number is Palindrome ? : "+checkpalindrome(n));
    	}
    	catch(Exception e) {
    		out.println(e);
    		out.println("Invalid Number \nEnter a Number :");
    		input();
    	}
    }

	private static boolean checkpalindrome(int n) {
	 
		int temp=n;
		int reverse=0;
		while(temp>0) 
		{
			reverse=reverse*10+temp%10;
			temp=temp/10;
		}
			out.println(reverse);
		if(reverse == n) return true;
		return false;
	}
	
	public static void main(String ...strings) {
		
		out.println("Enter a Number :");
		input();
	}
}
