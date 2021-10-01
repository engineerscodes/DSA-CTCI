// odeforces.com/contest/320/problem/A
// A magic number is a number formed by concatenation of numbers 1, 14 and 144. We can use each of these numbers any number of times. Therefore 14144, 141414 and 1411 are magic numbers but 1444, 514 and 414 are not.

// input:
// 114114
// output:
// YES

// input:
// 1111
// output:
// YES

// input:
// 441231
// output:
// NO

import java.util.*;
public class Magic_Number
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println((str.replace("144"," ").replace("14"," ").replace("1"," ").replace(" ", "")).length() == 0 ? "YES" : "NO"); 
    }
}