package assignment_day1;


		
		class Sum_methodWithreturnType
		{
			static int printsum(int n)
			{
				int sum=0;
				while(n!=0)
				{
					int rem=n%10;
					sum=sum+rem;
					n=n/10;
				}
				return sum;
				
			}
	

			public static void main(String[] args)
			{
				
		int x=Sum_methodWithreturnType.printsum(34567);
		System.out.println(x);
			
			}
		}

	
