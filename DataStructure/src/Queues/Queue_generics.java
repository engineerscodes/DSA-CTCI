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
	
	public String toString()
	{
		block<T> temp=front;
		while(temp!=null)
		{
			System.out.println("Value <-:->"+temp.data);
			temp=temp.next;
		}
		return "---------------------------Printing Done-----------------------------------------------------";
	}
	public static void main(String ...args)
	{
		
		Queue_generics <Integer> qg=new Queue_generics();
		qg.Queue(5);
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
		
	}
	
}



