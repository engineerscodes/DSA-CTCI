/*
 *    Describe how you could use a single array to Implement 3 stack
 *    logic----
 *    ' Approach -1''
 *     stack1-( 0-n/3 )
 *     stack2- ( n/2- 2n/3)
 *     stack 3-( 2n/3-n )
 *    '''
 *    Not optimal Solution .......
 */
package Stack;

/*
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Three_in_One 
{
    int Stacks[];
    int size;
    int top1,top2,top3;
	public Three_in_One(int size)
	{
		 this.size=size;
		 Stacks=new int[size];
		  top1=top2=top3=-1;
	}
	
	public void push(int data,int stkNo)
	{       
		    if(stkNo==1)
		 {    
		    	
		    	if(top1==-1) { top1=0; 
		         Stacks[top1]=data;
		         System.out.println("The value is Inserted in Stack1 : " +data);
		         return ;
		       }
		    else if(top1==((size/3)-1) ){  
		    	System.out.println("Stack1 is full pop value to Insert Values!!");
		        return ;
              }
		    	  Stacks[++top1]=data;
		    	  System.out.println("The value is Inserted in Stack1 : " +data);
		 }
		    else if(stkNo==2)
		    {     
		    	if(top2==-1) 
		    	{ top2=size/3; 
		    	Stacks[top2]=data;
		    	 System.out.println("The value is Inserted in Stack2 : " +data);
		    	return ;
		    	}
		    	if(top2==(2*(size/3))-1) 
		    	{System.out.println("Stack2 is full pop value to Insert Values!!");return ;}
		    	
		    	  Stacks[++top2]=data;
		    	  System.out.println("The value is Inserted in Stack2 : " +data);
		    }
		    else
		    {
		    	if(top3==-1)
		    	{ top3=(2*(size/3)); 
		    	Stacks[top3]=data;
		    	 System.out.println("The value is Inserted in Stack3 : " +data);
		    	return ;
		    	}
		    	
		    	if(top3==size-1) {System.out.println("Stack3 is full pop value to Insert Values!!");return ;}
		    	  Stacks[++top3]=data;
		    	  System.out.println("The value is Inserted in Stack3 : " +data);
		    }
	}
	
	public String toString()
	{   System.out.println("--------------------------PRINTING STACK ELEMENT'S-----------------------------");
		for(int i=top1;i>=0;i--)
		{
			System.out.println(" stack 1- at : "+i+" value : "+Stacks[i]);
		}
		for(int i=top2;i>=size/3;--i)
		{
			System.out.println(" stack 2- at : "+i+" value : "+Stacks[i]);
		}
		for(int i=top3;i>=(2*(size/3));i--)
		{
			System.out.println(" stack 3- at : "+i+" value : "+Stacks[i]);
		}
		
		return "";
	}

	
	public void pop(int stkNo)
	{
		if(stkNo==1)
		{    if(top1==-1) {System.out.println("Not possible stack1 is empty");return;}
			System.out.println("The element is poped from stack1 :"+Stacks[top1--]);
		}
		else if(stkNo==2)
		{      if(top2==(size/3) -1) {System.out.println("Not possible stack2 is empty");return;}
			System.out.println("The element is poped from stack2 :"+Stacks[top2--]);
		}
		else
		{
			  if(top3==(2*(size/3)) -1) {System.out.println("Not possible stack3 is empty");return;}
			System.out.println("The element is poped from stack3 :"+Stacks[top3--]);
			
		}
	}
	
	public static void main(String ...strings)
	{    // the size of Stack must be more than 3
		Three_in_One sk=new Three_in_One(10);
		 sk.push(1, 2);
		 sk.push(2, 2);
		 sk.push(10, 2);
		 sk.push(100, 2);
		 sk.push(99, 1);
		 sk.push(55, 1);
		 sk.push(888, 1);
		 sk.push(7, 3);
		 sk.push(77, 3);
		 sk.push(757, 3);
		 sk.push(5, 3);
		 //sk.push(96324, 3);
		 System.out.println(sk);
		 System.out.println("------------------Poping ------------------------");
		 for(int i=0;i<5;i++)
		 {
			 sk.pop(1);
             sk.pop(2);
             sk.pop(3);
		 }
		 System.out.println(sk);
		 
		 
	}
}

