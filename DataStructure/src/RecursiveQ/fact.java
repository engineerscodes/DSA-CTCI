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
			     /*
			     * if this BigInteger is too big to fit in an
			     * {@code int}, only the low-order 32 bits are returned.
			     * Note that this conversion can lose information about the
			     * overall magnitude of the BigInteger value as well as return a
			     * result with the opposite sign
			     */
    	
	    /*if(n.equals(b1)){
	    		return new BigInteger("1");
	    }*/
	    	
    	return n.multiply(factorial(n.subtract(b1)));
    	
    }
	
	public static void main(String ...strings) {
		
	 out.print(	new fact().factorial(new BigInteger("100")));
	}

}
//output
//933262154439441526816992388562667004907159682643
//816214685929638952175999932299156089414639761565
//182862536979208272237582511852109168640000000000
//00000000000000
