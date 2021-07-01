/**
 * 
 */
package String;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class StringBuilderQ {

	
	public static void main(String ...strings)
	{
		StringBuilder str=new StringBuilder("NAVEEN RANDOM CODER'S");
		System.out.println(str);
		str.append("\nPraveen's");
		//str.reverse();
		str.replace(0,4,"HEEL"); 
		System.out.println(str.lastIndexOf("n"));
		System.out.println(str);
	}

}

