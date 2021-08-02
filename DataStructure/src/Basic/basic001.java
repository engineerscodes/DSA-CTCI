/**
 * 
 */
package Basic;
import static java.lang.System.out;
/**
 * @author M.NAVEEN
 * RANDOM CODER'S
 *
 */
/*
 *  byte	1 byte	Stores whole numbers from -128 to 127
	short	2 bytes	Stores whole numbers from -32,768 to 32,767
	int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
	long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
	double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
	boolean	1 bit	Stores true or false values
	char	2 bytes	Stores a single character/letter or ASCII values
 * 
 */

import java.math.*;
import java.util.Scanner;
public class basic001 {

	
	public static void main(String[] args) {
        
		int n=(byte)050; 
		byte n2=50;
		out.println(n +" " +n2);
		String nav=" acacffdsabc";
		out.println(nav.indexOf("abc"));
		nav.concat("");
		String navs[]=nav.split("");
		int a[] =new int[5];
		out.println(a.length);
		double doube =(float)8.9;
		float s=8;
		final int x;
		x=1;
		A st=null;
	    A obj1=new A();
	    new A(obj1);
	   out.println( Math.min(10, 78.022));
	   Math.abs(-5);
	   Math.random();
	   
	   out.println((int)'a'-'a');
	
	}
	
	
	

}

class A{
	 
	public A(A a){
		
	}
public A(){
		
	}
	
	
}

