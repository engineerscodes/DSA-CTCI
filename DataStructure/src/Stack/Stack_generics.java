/**
 * 
 */
package Stack;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Stack_generics <T>
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
    	}
    }
    
    public void push(T newdata)
    {
    	block <	T>temp=new block<T>(newdata);
    	if(top==null) {top=temp;return ;}
    	temp.next=top;
    	top=temp;
    }
    public void pop() throws full
    {
    	if(top==null) {throw new full();}
    	else {
    		System.out.println(" DATA POPED IS :"+top.data);
    	    top=top.next;
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
    
    public static void main(String ...strings) throws full
    {
    	
    	Stack_generics<Integer> sk=new Stack_generics();
    	sk.push(10);
    	sk.push(25);
    	sk.push(5);
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
    	System.out.println(sk3);
    	
    	
    }
    
}

class full extends Exception{
	
	full(){System.out.println("STACK IS FULL");
	}
	
	public String toString() {return "STACK IS FULL insert values to Stack !!";}
}
