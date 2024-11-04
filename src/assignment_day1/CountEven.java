package assignment_day1;

public class CountEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5467354;
		int sum=0;
		int count=0;
		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);

	}

}
