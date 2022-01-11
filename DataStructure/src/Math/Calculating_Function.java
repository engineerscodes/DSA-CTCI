// codeforces.com/contest/486/problem/A
// Example :
// f(4) =  - 1 + 2 - 3 + 4 = 2
// f(5) =  - 1 + 2 - 3 + 4 - 5 =  - 3
// Using Mathmematical Iduction we get = (n / 2) - n
package Math;

import java.util.*;
public class Calculating_Function 
{
    public static void main(String[] args) 
    {
        long n = new Scanner(System.in).nextLong(); 
		System.out.println(n % 2==0 ? n / 2 : (n / 2) - n ); 
	}
}