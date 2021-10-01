// codeforces.com/contest/617/problem/A
// input:
// 5
// output:
// 1

// input:
// 12
// output:
// 3
import java.util.*;
public class Elephant
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n;)
        {
            if(n % 5 == 0)
            {
                System.out.println(n / 5); break;
            }
            else
            {
                System.out.println((n / 5) + 1); break;
            }
        }
 }
}