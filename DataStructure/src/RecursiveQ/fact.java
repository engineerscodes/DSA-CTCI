/**
 * 
 */
package RecursiveQ;
import static java.lang.System.out;
/*
 about BigInteger  https://www.geeksforgeeks.org/biginteger-class-in-java/
 */
/*
	For example factorial of 100 contains 158 digits in it so we can’t store it in any primitive data type available.
	We can store as large Integer as we want in it. 
	There is no theoretical limit on the upper bound of the range because memory is allocated dynamically 
	but practically as memory is limited you can store 
	a number which has Integer.
	MAX_VALUE number of bits in it which should be sufficient to store mostly all large values
  */
import java.math.BigInteger;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class fact {

    public BigInteger factorial(BigInteger n) {
    	 BigInteger b1=new BigInteger("1");
    	if(n.intValue()<=1) {
    		return new BigInteger("1");
    	} 
    	if(n.equals(b1)){
    		return new BigInteger("1");
    	}
    	
    	return n.multiply(factorial(n.subtract(b1)));
    	
    }
	
	public static void main(String ...strings) {
		
	 out.print(	new fact().factorial(new BigInteger("0")));
		
	}

}

