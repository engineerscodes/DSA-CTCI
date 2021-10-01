// codeforces.com/problemset/problem/271/A
import java.util.*;
public class BeautifulYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
 
		while(Integer.toString(++y).chars().distinct().count() < 4) {}
 
		System.out.println(y);	
	}
}