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
public class PalindromePermutation {

	
	public static void main(String args[]) {
		
		String str="aacc";
		int ch[]=new int[128];
		
		for(int i=0;i<str.length();i++) {
			ch[str.charAt(i)]++;
		}
		System.out.println(Arrays.toString(ch));
		int count=0;
		for(int i=0;i<128;i++) {
			count=count+(ch[i]%2); 
		}
		if(count>1) //only the middle char can have count=1
			System.out.println("NO Palidrome permuation is possible");
		else {
			System.out.println("Palidrome permuation is possible");
		}
		
	}
	
}
