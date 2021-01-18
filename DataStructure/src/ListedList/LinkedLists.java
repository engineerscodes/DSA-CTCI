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
    
    
    
    public void sort() {
    	System.out.println("-------------sorting-----------");
    	
    	ArrayList<node> temp=new ArrayList<node>();
    	  node dis=head;
    	  
    	  while(dis!=null) {
			temp.add(dis);
		 dis=dis.next;}
    	  //temp.sort(null); This will throw error ...........we need a comparator
    	  
    	  temp.sort(new Comparator<node>() {

			@Override
			public int compare(node e1, node e2) {
				    if(e1.data.toString().compareTo(e2.data.toString())<0)
				    	return -1;
				    else if(e1.data.toString().compareTo(e2.data.toString())>0)
				    	return 1;
				    else 
				    	return 0;
			}
    		  
    	  });
    	 // dis=null;
    	  node del=head;
    	  
    	/*  for(int i=0;i<temp.size();i++)
    	  {
    		 System.out.println(temp.get(i).data);
    		  
    	  }
    	  System.out.println("-------------------");
    	  for(int i=0;i<temp.size();i++)
    	  {   String str="[";
    		 System.out.println(temp.get(i).data);
    		 System.out.println("NODE VALUE :"+del.data);
    		  del.data=temp.get(i).data;   //this statement refernces arrayList with linkedlist....
    		  //so changes are reflected in both
    		   //and deep clone of node class will not work 
    		  for(node e:temp) {str+=e.data+",";}
    		  System.out.println("ArrayList :"+str+"]");
    		  System.out.println("new Node value :"+del.data);
    		  del=del.next;
    	  }
    	  System.out.println("-------------------");
    	  for(int i=0;i<temp.size();i++)
    	  {
    		 System.out.println(temp.get(i).data);
    		  
    	  } */
    	  
    	//fix
    	  StringBuilder st=new StringBuilder();
    	  for(int i=0;i<temp.size();i++)
    	  {
    		  System.out.println(temp.get(i).data);
    		  st.append(temp.get(i).data+",");
    	  }
    	   //One issue Because of References  del=temp.get(index).data result in error
    	  //System.out.print(st.toString()); 
    	  String array[]=st.toString().split(",");
    	  int count=0;
    	  while(del!=null)
    	  {
    		  del.data=array[count++];// now no refeernces is create ...........
    		//  System.out.println(Arrays.toString(array));
    		  del=del.next;
    	  }
    	  //U should not use this method must use Merger Sort ......
    	   
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
    	
    	ls.sort();
    	System.out.println(ls);
    }
    
    
    
}





class LinkedListEmpty extends Exception
{
	LinkedListEmpty(){System.out.println("Linked List is Empty!!!!");}
	
	public String toString() {return "Linked is Empty Insert Nodes!!";}
}

