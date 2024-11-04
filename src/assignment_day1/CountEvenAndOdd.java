package assignment_day1;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5467354;
		int sum=0;
		int count_even=0;
		int count_odd=0;
		
		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				count_even++;
			}
			if(rem%2==1)
			{
				count_odd++;
			}
			n=n/10;
		}
		System.out.println(count_even);
		System.out.println(count_odd);

	}

}
