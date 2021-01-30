/**
 * 
 */
package ListedList;

import java.util.*;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class fromLast  
{


	public static  Object KfromLast(LinkedLists.node head,int pos)
	{
		LinkedLists.node temp=head;
		ArrayList <Object>ls=new ArrayList<Object>();
		while(temp!=null)
		{
			ls.add(temp.data);
			temp=temp.next;
		}
		if(ls.size()<pos) {System.out.println("Not Possible"); return null;}
		System.out.println("Object to Returned :"+ls.get(ls.size()-pos));
		return (ls.get(ls.size()-pos));
	}
	
	public static Object optimalKromLast(LinkedLists.node head,int k) 
	{      LinkedLists.node temp1=head;
	       LinkedLists.node temp2=head;
		 //Using To poiner K apart eg -5 and the length of the list is 11
		//temp1 will start from 0 and reach 5 and temp1 at k Interation k=5
		//from here move temp1 and temp2 together from 
		// when temp is at 11 & temp2 will get at 6=(11-5)
		for(int i=0;i<k;i++)
		{
			if(temp1==null) {System.out.println("Not Possible"); return null;}
			temp1=temp1.next;
		}
		while(temp1!=null)
		{
			temp1=temp1.next;
			temp2=temp2.next;
		}
		System.out.println("Object to Returned :"+temp2.data);
		return temp2;
	}
	
	public static void main(String[] args) 
	{
		LinkedLists l=new LinkedLists();
    	l.append(10);
    	l.append(1);
    	l.append("Naveen");
    	l.append("Naveen");
    	l.append("Naveen");
    	l.append("Naveen");
    	l.append(20);
    	l.append(10);
    	l.append(30);
    	l.append(30); 
        l.append(1);
        l.append(1);
        l.append(2);
        l.append(3);
        l.append(8);
        l.append(1);
    	
        
        KfromLast(l.head,50);
        KfromLast(l.head,11);
        optimalKromLast(l.head,10);
        optimalKromLast(l.head,50);
    	System.out.println(l);	

	}

}

