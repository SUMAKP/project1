package assignment_day1;

public class Sum_OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=54671;
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

}
