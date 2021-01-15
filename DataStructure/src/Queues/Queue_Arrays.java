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
	     if(rear==size-1) {new queueFullException();return ;}
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
    public static void main(String ...strings) throws queueFullException
    {
    	Queue_Arrays qa=new Queue_Arrays(5);
    	qa.Inqueue(1);
    	qa.Inqueue(3);
    	qa.Inqueue(9);
    	qa.Inqueue(5);
    	qa.Inqueue(8);
    	System.out.println(qa);
    }
    
    public String toString()
    {   System.out.println("!!!!!!!!!!!!!!!!!!!!! Element's in Queue !!!!!!!!!!!!!!!!!!!");
    	for(int i=front ;i<=rear;i++)
    	{
    		System.out.println(queues[i ]);
    	}
    	return "!!!!!!!!!!!!!!!!!!!!!!!End of the Queue!!!!!!!!!!!!!!!!!!!!!";
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