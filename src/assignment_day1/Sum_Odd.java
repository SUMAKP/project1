package assignment_day1;

public class Sum_Odd {

	public static void main(String[] args) {
		int n=5467;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				sum=sum+rem;
			}
			n=n/10;
		}
		System.out.println(sum);

	}

}
