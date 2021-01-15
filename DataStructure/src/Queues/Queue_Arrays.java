/**
 * 
 */
package Queues;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Queue_Arrays 
{   int queues[];
    int size;
    int front ,rear;
	public Queue_Arrays(int size)
	{
		  this.size=size;
		  queues=new int[size];
		  front=rear=-1;
	}
	
	public void Inqueue(int data) throws queueFullException
	{
	     if(rear==size-1) {throw new queueFullException();}
	     if(front==-1 && rear==-1) 
	     {
	    	  rear=front=0;
	    	  queues[rear]=data;
	    	  System.out.println("The value is Inserted :"+queues[rear]+" :at -"+rear); 	 
	    	  return ;
	     }
	     queues[++rear]=data;
	     System.out.println("The value is Inserted :"+queues[rear]+" :at -"+rear); 	 
	}
	  public void dequeue() throws emptyQueueException
	    {
	    	if(rear==-1 && front ==-1) {
	    		throw new emptyQueueException();
	    	}
	    	if(rear==front) {System.out.println("the element is dequeued :"+queues[front]);
	    	   rear=front=-1;
	    	return;}
	    	System.out.println("the element is dequeued :"+queues[front]);
	    	front++;
	    }
	  public void sort ()
	    {  System.out.println("!!!!!!!!!!!!!!!!!Sorting !!!!!!!!!!!!!!!!!");
	  	  ArrayList <Integer>temp=new ArrayList();
	  	  for(Integer i :queues) {temp.add(i);}
	  	  temp.sort(null);
	  	  System.out.println(temp);
	  	  for(int i=front;i<=rear;i++) {queues[i]=temp.get(i);}
	  	  
	    }
	    public String toString()
	    {   System.out.println("!!!!!!!!!!!!!!!!!!!!! Element's in Queue !!!!!!!!!!!!!!!!!!!");
	       if(front ==-1&& rear==-1) {System.out.println("Empty Queue"); return"";}
	        
	    	for(int i=front ;i<=rear;i++)
	    	{
	    		System.out.println(queues[i ]);
	    	}
	    	return "!!!!!!!!!!!!!!!!!!!!!!!End of the Queue!!!!!!!!!!!!!!!!!!!!!";
	    }
	    
	  
    public static void main(String ...strings) throws queueFullException,emptyQueueException
    {
    	Queue_Arrays qa=new Queue_Arrays(5);
    	qa.Inqueue(1);
    	qa.Inqueue(39);
    	qa.Inqueue(99);
    	qa.Inqueue(58);
    	qa.Inqueue(8);
    	
    	System.out.println(qa);
    	qa.sort();
    	System.out.println("After sorting !!!!!");
    	System.out.println(qa);
    	
    	qa.dequeue();
    	qa.dequeue();
    	qa.dequeue();
    	qa.dequeue();
    	qa.dequeue();
    	System.out.println(qa);
    }
  
}
class emptyQueueException extends Exception
{
	public emptyQueueException() {System.out.println("Queue is Empty!!!!");return ;}
	public String  toString()
	{
		return "QUEUE IS EMPTY INSERT VALUES!!!";
	}
}
class queueFullException extends Exception
{
	  public queueFullException()
	  {
		  System.out.println("Stack is Full");
	  }
	  public String toString()
	  {
		  return "Inqueue Operations Not Possible ......Need to Dequeue First!!!!...";
	  }
}