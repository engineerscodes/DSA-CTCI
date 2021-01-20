/**
 * 
 */
package ListedList;
import java.util.*;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'
 *  S
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
		  /*  LinkedLists.node temp=head;
		    LinkedLists.node n=null ;
		    HashSet <Object>set=new HashSet<Object>();
		    while(temp!=null)
		    {
		    	if(set.contains(temp.data)) {n.next=temp.next;System.out.println("set :"+n.next.data);}
		    	else {
		    		set.add(temp.data);
		    		System.out.println(temp.data);
		    		n=temp;
		    	}
		    	temp=temp.next;
		    }*/
		LinkedLists.node temp=head;
		LinkedLists.node previous=null;
		HashSet<Object> hs=new HashSet<>();
		while(temp!=null)
		{   if(hs.contains(temp.data)) {previous.next=temp.next;}
		else {
			hs.add(temp.data);
			previous=temp;
		}
			temp=temp.next;
		}
		    
	}
	
	public static void DupsNobuffer(LinkedLists.node head)
	{
		//Using to Two Pointer 
		//same has with array we do
		LinkedLists.node follwer=head;
		
		while(follwer!=null)
		{    LinkedLists.node upfront=follwer;
		   while(upfront.next!=null) 
		   { 
			if(follwer.data==upfront.next.data)
			{
				upfront.next=upfront.next.next;
			}
			else {
				upfront=upfront.next;
			}
		    }
		   System.out.println("path"+follwer.data);
		   follwer=follwer.next;
		   
		}
		
	}
	
    public static void main(String ...strings)
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
    	//Remove_Dups(l.head);
    	System.out.println(l);
    	//DupsOptimal(l.head);
    	DupsNobuffer(l.head);
    	System.out.println(l);
    }
}

