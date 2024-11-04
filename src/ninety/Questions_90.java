package ninety;

public class Questions_90 
{
    	static int sum=0;
    	 public static int recursion(int n)
    			 {
    		 if(n!=0)
    		 {
    			 int rem=n%10;
    			 sum=sum+rem;
    			 n=n/10;
    			 recursion(n);
    		 }
    		 return sum;
    			 }
    	 public static void main(String[]args)
    	 {
    		 int n=1234;
    		System.out.println(recursion(n)); 
    	
    	
    	}

		}

