/**
 * 
 */
package Stack;
import java.lang.reflect.Array;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Stacks_Array 
{   int stackA[];
    int size;
    int top;//pointer to the top

	public Stacks_Array(int size) 
	{      this.size=size;
		   stackA=new int[size];
		   top=-1;
	}
	
	
	public boolean isFull() {if(top==size-1) {return true;}return false;}
	
	public void push(int data)
	{
		if(isFull()) {System.out.println("Stack is Full !!!"); return ;}
		//top++;
		 stackA[++top]=data;
		 System.out.println("THE VALUE IS INSERTED :"+stackA[top]);
		
	}
	
	public void pop()
	{
		if(top==-1) {System.out.println("Stack is Empty!!!");return ;}
		System.out.println("The element is remove :"+stackA[top--]);
		
	}
	
	public String toString()
	{
		if(top==-1) {System.out.println("Stack is empty ::");return "";}
		for(int i=top;i>=0;i--)
		{
			System.out.println("pos :"+i+" :"+stackA[i]);
		}
		return "";
	}
    
	public void sort()
	{
		ArrayList <Integer> temp=new ArrayList();
		for(int i=0;i<=top;i++) {temp.add(stackA[i]);}
		//Collections.sort(temp);
		temp.sort(null);
		System.out.println(temp);
		for(int i=0;i<=top;i++) {stackA[i]=temp.get(i);}
	}
		
	
	public static void main(String ...args)
	{
	    Stacks_Array st=new Stacks_Array(5);
	    st.push(10);
	    st.pop();
	    st.push(50);
	    st.push(100);
	    st.push(75);
	    st.push(2);
	    st.push(45);
	    
	    st.push(1);
	    System.out.println("----------------------Before Sort-----------------------------");
	    System.out.println(st);
	    st.sort();
	    System.out.println("----------------------After Sort-----------------------------");
	    System.out.println(st);
	    st.pop();
	    st.pop();
	    System.out.println(st);
	    st.pop();
	    st.pop();
	    System.out.println(st);
	    st.pop();
	    st.pop();
	    System.out.println(st);
	    System.out.println("------------------------NEW ARRAY couter Overflow of Array---------------------------------------");
	    Stacks_Array st2=new Stack_Array2(2);
	    st2.push(1);
	    st2.push(5);
	    st2.push(0);
	    st2.push(15);
	    st2.push(85);
	    st2.push(99);
	    st2.sort();
	    System.out.println(st2);
	    
	    
	}
	
}


class Stack_Array2 extends Stacks_Array
{
	Stack_Array2(int size)
	{
		super(size);
	}
	
	public void push(int data)
	{
		if(super.isFull())
		{  System.out.println("SIze *2");
			int newTemp[]=new int [2*stackA.length];
			size=2*stackA.length;
			System.arraycopy(stackA, 0, newTemp, 0, stackA.length);
			stackA=newTemp;
		}
		stackA[++top]=data;
		System.out.println("the value in pushed :"+data);
	}
	
}
