// codeforces.com/problemset/problem/339/A
// input:
// 3+2+1
// output:
// 1+2+3

// input:
// 1+1+3+1+3
// output:
// 1+1+1+3+3
package Math;
import java.util.*;
public class Helpful_Maths
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String[] str = in.next().split("\\+"); 
        Arrays.sort(str);
        System.out.print(String.join("+", str));
    }
}