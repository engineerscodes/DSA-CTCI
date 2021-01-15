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
public class Queue_generics <T>
{  
    block <T>front ,rear;
    
    static  class block<T>{
    	T data;
    	block<T> next;
    	
    	public block(T data)
    	{
    		this.data=data;
    		next=null;
    	}
    }
	public Queue_generics() 
	{
		 front=null;
		 rear=null;
	}
	
	public void Queue(T  newdata)
	{
		block <T>q=new block(newdata);
		if(front==null && rear==null)
		{
			front=q;
			rear=q;	
			return;
		}
		if(rear!=null)
			rear.next=q;
		rear=q;
			
	}
	
	public void deQueue() throws emptyQueueException
	{
		if(front==null && rear==null) {
			throw new emptyQueueException();
		}
		if(front==rear) {
			System.out.println("THE ELEMENT IS POPED WITH VALUE : "+front.data);
			front=null;
			rear=null;
			return ;
		}
		System.out.println("THE ELEMENT IS POPED WITH VALUE : "+front.data);
		front=front.next;
	}
	
	public String toString()
	{   System.out.println("---------------------------Element in QUEUE----------------------------------------------------");
	    if(front==null)
	    {
	    	System.out.println("QUEUE IS EMPTY !!!!!INSERT VALUES");
	    	return "";
	    }
		block<T> temp=front;
		while(temp!=null)
		{
			System.out.println("Value : "+temp.data);
			temp=temp.next;
		}
		return "";
	}
	
	
	public static void main(String ...args)throws emptyQueueException
	{
		
		Queue_generics <Integer> qg=new Queue_generics();
		qg.Queue(5);
		System.out.println(qg);
		qg.deQueue();
		System.out.println(qg);
		qg.Queue(100);
		qg.Queue(11);
		System.out.println(qg);
		
		Queue_generics<Character> q=new Queue_generics<Character>();
		Queue_generics<Double> q2=new Queue_generics<>();
		for (int i=0;i<26;i++)
		{
			q.Queue((char)(i+65));
			q2.Queue((double)i);
		}
		System.out.println(q);
		System.out.println(q2);
		System.out.println("Poping Out values ");
		for (int i=0;i<20;i++)
		{
			q.deQueue();
		}
		System.out.println(q);
	}
	
}



