/**
 * 
 */
package RecursiveQ;
import java.util.*;

import static java.lang.System.out;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class q1 {

    public int fun(int n) {
    	
    	    if(n==1){;
    	    	return 1;
    	    }
    	    
    	    return fun(n-1)+fun(n-1);
    }
	
	public static void main(String ...strings) {
		
	   out.println(new q1().fun(4));
		
	}

}

