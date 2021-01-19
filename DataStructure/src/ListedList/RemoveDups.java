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
public class RemoveDups   {

	
	public static void Remove_Dups(LinkedLists.node head)
	{
		   Set <Object> hashList=new LinkedHashSet();
		   LinkedLists.node temp=head;
		   LinkedLists.node temp2=head;
		   while(temp!=null)
		   {
			   hashList.add(temp.data);
			   temp=temp.next;
		   }
		   System.out.println(hashList);
		    int count=0;
		   for(Object e:hashList)
		   {   count++;
			   temp2.data=e;
			   if(count==hashList.size()) {temp2.next=null;return ;}
			   temp2=temp2.next;
		   }
		   temp2.next=null;
	}
	
	public static void DupsOptimal(LinkedLists.node head)
	{
		    LinkedLists.node temp=head;
		    LinkedLists.node n=null ;
		    HashSet set=new HashSet();
		    while(temp!=null)
		    {
		    	if(set.contains(temp.data)) {n.next=temp.next;}
		    	else {
		    		set.add(temp.data);
		    		n=temp;
		    	}
		    	temp=temp.next;
		    }
		    
	}
	
	public static void DupsNobuffer()
	{
		//Using to Buffer
	}
	
    public static void main(String ...strings)
    {
    	LinkedLists l=new LinkedLists();
    	l.append(10);
    	l.append(1);
    	l.append("Naveen");
    	l.append("Naveen");
    	l.append(20);
    	l.append(10);
    	l.append(30);
    	l.append(30);
    	//Remove_Dups(l.head);
    	System.out.println(l);
    	DupsOptimal(l.head);
    	System.out.println(l);
    }
}

