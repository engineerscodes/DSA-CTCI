/**
 * 
 */
package RecursiveQ;
import static java.lang.System.out;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Fibonacci {

	
	public int Fibo(int n) {
		
		if(n==0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		
		return Fibo(n-1)+Fibo(n-2);
		
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			out.println(new Fibonacci().Fibo(i));
        }
		
	}

}
//using normal loop its only O(n)
