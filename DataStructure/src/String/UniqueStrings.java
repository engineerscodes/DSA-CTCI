/**
 * 
 */
package String;

import java.util.*;

/**
 * @author M.NAVEEN
 * RANDOM CODER'S
 *
 */
public class UniqueStrings {

	
	public static void main(String[] args) {
		
		
		String str="aca";
		
		int uni[]=new int[28];
	    boolean flag=false;
		for(int i=0;i<str.length();i++) {
			
			int index=str.charAt(i)-'a';
			uni[index]+=1;
			if(uni[index]>1)
			{
				System.out.println("Is Not Unique ");
				flag=true;
				break;
			}
			
		}
		if(flag==false)
			System.out.println("IS UNIQUE");
       //System.out.println(Arrays.toString(uni));
	}

}
