// codeforces.com/contest/282/problem/A
// Operation ++ increases the value of variable x by 1.
// Operation -- decreases the value of variable x by 1.

// You're given a programme in language Bit++. The initial value of x is 0. Execute the programme and find its final value (the value of the variable when this programme is executed).

// input:
// 2
// X++
// --X

// output:
// 0
package Math;
import java.util.*;
public class Bit 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n, x = 0, i;
        n = in.nextInt();
        for (i = 0; i < n; i++) 
        {
            String str = in.next();
            if (str.charAt(1) == '+')
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}