/**
 * 
 */
package String;

import java.util.Arrays;

/**
 * @author M.NAVEEN
 * RANDOM CODER'S
 *
 */
public class StringPermutations {

	
	public static void main(String ...strings) {
		
		//check if two string are permuations of each other
		
		String str1="Dog";
		String str2="God";
		
		if(str1.length()!=str2.length()) {
			System.out.println("IS NOT PERMUTATIONS");
			System.exit(0);
		}
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String t1=new String(ch1);
		String t2=new String(ch2);
		System.out.println(t1+"  "+t2);
		if(t1.equals(t2)) {
			System.out.println("IS PERMUTATIONS");
		}else {
			System.out.println("IS NOT PERMUTATIONS");
		}
		
		
		//or
		
		
		
	
		
		
	}
	
}
