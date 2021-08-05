/**
 * 
 */
package SearchAlgo;

import java.util.Arrays;

/**
 * @author M.NAVEEN
 * RANDOM CODER'S
 *
 */


 class firstandlast {
    public static void main(String ...str) 
    {    int nums[]= {0,0,1,2,2};
         int target=0; 
        int res=Bsearch(nums,target);
        System.out.println("INDEX "+res);
        int rep[]=new int[2];
        rep=findlastandfirst(res,nums);
       
        System.out.println(Arrays.toString(rep));
    }
    public static int[] findlastandfirst(int index,int n[]){
    
        int first=index;
        int last=index;
        if(index >=1 && index!=n.length-1){
            
                while(first-1>=0 && n[first-1]==n[index] ){
                      first--;      
                } 
                 while(last +1 <=n.length-1 && n[last+1]==n[index] ){
                    last++;
                }   
           return new int[]{first,last};
        }
        else  if(index == 0){
        	
        	 while( last+1<=n.length-1 && n[last+1]==n[index]){
                 last++;
             } 
          return new int[]{first,last};
        }
        
        else  if(last ==n.length-1){
        	
        	 while( first-1>=0 && n[first-1]==n[index]){
                 first--;      
           } 
            
            return new int[]{first,last};
        }
        
       else{
           return new int[]{-1,-1};
       }
        
    }
    
    
    public static int Bsearch(int n[],int data ){
        
        
        int last=n.length-1;
        int beg=0;
        
        while(beg<=last){
            
            int mid=(beg+last)/2;
            
            if(n[mid]==data){
                return mid;
            }
            else if(data<n[mid]){
                last=mid-1;
            }
            else{
                beg=mid+1;
            }
            
        }
        
        return -1;
    }
}
