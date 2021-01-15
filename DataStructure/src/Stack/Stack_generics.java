/**
 * 
 */
package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.List;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Stack_generics <T >
{
     block <T> top;
	public Stack_generics() 
	{  
		top=null;
	}
    static class block<T>
    {   T data;
    	block<T> next;
    	
    	public block(T data)
    	{
    	    this.data=data;	
    	    next= null;
    	}
    }
    
    public void push(T newdata)
    {
    	block <	T>temp=new block<T>(newdata);
    	if(top==null) {top=temp;return ;}
    	temp.next=top;
    	top=temp;
    }
    public void pop() throws empty 
    {
    	if(top==null) {throw new empty ();}
    	else {
    		System.out.println(" DATA POPED IS :"+top.data);
    	    top=top.next;
    	}    	
    }
    
    public void sort() throws empty 
    {   System.out.println("----------------------------Sorting------------------------------------------");
    	if(top==null) {throw new empty ();}
    	else
    	{
    		/* ArrayList  temp=new ArrayList();
    		 block <T> dis=top;
    		 while(dis!=null) {temp.add(dis.data); dis=dis.next;}
    		 Collections.sort( temp) ;
    		 System.out.println(temp);*/
    		/*
    		 The java string compareTo() method compares the given string with current string lexicographically.
    		  It returns positive number, negative number or 0.

             It compares strings on the basis of Unicode value of each character in the strings.

          If first string is lexicographically greater than second string, 
         it returns positive number (difference of character value). 
        If first string is less than second string lexicographically, 
        it returns negative number and if first string is lexicographically equal to second string, it returns 0.
    		 **/
    		//This sorting is not based on comaring based on NUmber 
    		//sorting is done on based on ascii and string length
    		
    		ArrayList  <block<T>>temp=new ArrayList<block<T>>();
    		block<T> dis=top;
    		while(dis!=null) {temp.add(dis);dis=dis.next;}
    		temp.sort(new Comparator<block <T>>()
    		{

				@Override
				public int compare(block b1, block b2) {
					if(b1.data.toString().compareTo(b2.data.toString())>0)
						return 1;
					else if (b1.data.toString().compareTo(b2.data.toString())<0)
						return -1;
					else //if equal 
						return 0;
				}
    			
    		});
    		int count=0;
    		for(block <T> e:temp)
        	{
        		System.out.println("Pos :"+count+" value :"+e.data);
        		count++;
        	}
    	}
    	
    }
    
    
    public String toString()
    {    System.out.println("------------------------------Display--------------------------------------- ");
    	block <T> dis=top;
    	   while(dis!=null)
    	   {
    		   System.out.println(dis.data);
    		   dis=dis.next;
    	   }
    	   return "";
    }
    
    public static void main(String ...strings) throws empty 
    {
    	
    	Stack_generics<Integer> sk=new Stack_generics();
    	sk.push(10);
    	sk.push(25);
    	sk.push(199);
    	sk.push(5);
    	System.out.println(sk);
    	sk.sort();
    	sk.pop();
    	sk.pop();
    	sk.pop();
    	System.out.println(sk);
    	Stack_generics<Float> sk2=new Stack_generics();
    	sk2.push(9.99f);
    	sk2.push(33.33333f);
    	sk2.push(1.2222f);
    	
    	System.out.println(sk2);
    	
    	Stack_generics<String> sk3=new Stack_generics();
    	sk3.push("Naveen");
    	sk3.push("Bala");
    	sk3.push("Praveen");
    	sk3.sort();
    	System.out.println(sk3);
    	
    	
    }
    
}

class empty extends Exception{
	
	empty (){System.out.println("STACK IS empty");
	}
	
	public String toString() {return "STACK IS FULL insert values to Stack Not Possible!!";}
}
