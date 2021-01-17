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
public class LinkedLists 
{
    node head;
	static class node
	{
		 Object data;
		 node next;
		 
		 
          public node(Object data)
		 {   
			 this.data=data;
			 next=null;
		 }
	}
	public LinkedLists() 
	{
	   head=null;
	}
   
    public void append(Object newdata)
    {
    	node temp=new node(newdata);
        if(head==null) { head=temp;   return ;}
        node dis=head;
        while(dis.next!=null)
        {
        	dis=dis.next;
        }
          dis.next=temp;
          
    }
    
    public void insertbefore(Object newdata)
    {
    	if(head==null) {append(newdata); return ;}
    	 node temp=new node(newdata);
    	 temp.next=head;
    	 head=temp;  //now head is pointing to temp........!!!
    }
    
    
    public void removeFront() throws LinkedListEmpty
    {
    	  if(head==null) {throw new LinkedListEmpty();}
    	  System.out.println("the node with value : "+head.data +" is poped");
    	  head=head.next;
    }
    
    
    public void removeEnd() throws LinkedListEmpty
    {
    	  if(head==null) {removeFront(); return;}
    	  
    	  node temp=head;
    	  while(temp.next.next!=null) {temp=temp.next;}
    	  System.out.println("The Node with value : "+temp.next.data +" is Poped ");
    	  temp.next=null;
    	  
    }
    public String toString()   //overriden methods cannot throw boader expection for checked Exceptions
    {   System.out.println("--------------------------------Printing List-----------------");
    	try{if(head==null) {throw new LinkedListEmpty();}}  
    	catch(LinkedListEmpty e) {e.printStackTrace(); System.exit(0);}
    	
    	node dis=head;
    	while(dis!=null) {System.out.println(dis.data); dis=dis.next;}
    	return "";
    }
    
    
    public static void main(String ...strings) throws LinkedListEmpty
    {
    	LinkedLists ls=new LinkedLists();
    	//System.out.println(ls);
    	ls.append(100);
    	ls.append(12.5);
    	ls.append(7894);
    	ls.insertbefore("Naveen");
    	ls.insertbefore(true);
    	ls.append(55.96385f);
    	System.out.println(ls);
    	ls.removeFront();
    	ls.removeFront();
    	System.out.println(ls);
    	ls.removeEnd();
        ls.removeEnd();
        ls.insertbefore("Virat");
        ls.append("Covid-2021");
    	System.out.println(ls);
    }
}





class LinkedListEmpty extends Exception
{
	LinkedListEmpty(){System.out.println("Linked List is Empty!!!!");}
	
	public String toString() {return "Linked is Empty Insert Nodes!!";}
}

