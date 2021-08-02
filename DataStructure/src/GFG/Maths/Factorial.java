/**
 * 
 */
package GFG.Maths;
import java.util.*;
/**
 * @author M.NAVEEN
 * RANDOM CODER'S
 *
 */
public class Factorial {

	
	public static void main(String ...strings) 
	{
		int n=new Scanner(System.in).nextInt();
		long fact=1;
		for(int i=1;i<=n;i++) {
			 fact*=i;
		}
		
		System.out.println(fact);
		System.out.println("fact using rec :"+rec(n));
	}

	
	private static int rec(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		else return n*rec(n-1);
			
		
	}
}
