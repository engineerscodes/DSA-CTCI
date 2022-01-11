// Beautiful Matrix
// You've got a 5 × 5 matrix, consisting of 24 zeroes and a single number one. Let's index the matrix rows by numbers from 1 to 5 from top to bottom, let's index the matrix columns by numbers from 1 to 5 from left to right. In one move, you are allowed to apply one of the two following transformations to the matrix:

// Swap two neighboring matrix rows, that is, rows with indexes i and i + 1 for some integer i (1 ≤ i < 5).
// Swap two neighboring matrix columns, that is, columns with indexes j and j + 1 for some integer j (1 ≤ j < 5).
// You think that a matrix looks beautiful, if the single number one of the matrix is located in its middle (in the cell that is on the intersection of the third row and the third column). Count the minimum number of moves needed to make the matrix beautiful.

// *input:           *output:
//  0 0 0 0 0         3
//  0 0 0 0 1
//  0 0 0 0 0
//  0 0 0 0 0
//  0 0 0 0 0

package Math;
import java.util.*;
public class BeautifulMatrix 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int m[][] = new int[5][5];
        int i, j, x = 0, y = 0;
        
        for(i = 0; i < 5; i++)
        for(j = 0; j < 5; j++)
        {
            m[i][j] = in.nextInt();
            if(m[i][j] == 1)
            {
                x = i;
                y = j;
            }
        }
        System.out.println(Math.abs(2 - x) + Math.abs(2 - y));
    }    
}