// codeforces.com/problemset/problem/791/A
// Bear Limak wants to become the largest of bears, or at least to become larger than his brother Bob.

// Right now, Limak and Bob weigh a and b respectively. It's guaranteed that Limak's weight is smaller than or equal to his brother's weight.

// Limak eats a lot and his weight is tripled after every year, while Bob's weight is doubled after every year.

// After how many full years will Limak become strictly larger (strictly heavier) than Bob?
import java.util.*;
public class Bear_and_Brother
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int count = 0;
        
        for(int i = 0; i < a*b; i++)
        {
            count++;
            if(a * 3 > b * 2)
            {   
                System.out.println(count);
                break;
            }
            a *= 3;b *=2;
        }
    }
}