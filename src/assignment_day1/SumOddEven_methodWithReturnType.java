package assignment_day1;

 class SumOddEven_methodWithReturnType
 {
	static void printsum(int n)
	{
	
	int sum_even=0;
	int sum_odd=0;
	while(n!=0)
	{
		int rem=n%10;
		if(rem%2==1)
		{
			sum_odd=sum_odd+rem;
		}
		else if(rem%2==0)
		{
			sum_even=sum_even+rem;
		}
		n=n/10;
	}
	System.out.println(sum_odd);
	System.out.println(sum_even);
	}
 
	

		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			SumOddEven_methodWithReturnType.printsum(4562);
			
			

		}

	}


