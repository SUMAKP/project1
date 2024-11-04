package assignment_day1;

public class FetchEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=54676102;

		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				System.out.print(" Even:"+rem);
			}
			if(rem%2!=0)
			{
				System.out.print(" Odd: "+rem);
			}
			n=n/10;
			
		}
		
		System.out.println("\n ================================\n ");
		
		int a[]= {4,6,7,8,9};
		
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]%2==0)
			{
				System.out.print("Even:"+a[i]);
			}
			
			
			
		}
			
		for(int i=0;i<a.length;i++)
		{
						
			if(a[i]%2!=0)
			{
				System.out.print("Odd"+a[i]);
			}
			
		}
			
		}
		
		

	}

