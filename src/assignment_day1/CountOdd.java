package assignment_day1;

public class CountOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=546735;
		int sum=0;
		int count=0;
		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);


	}

}
