package assignment_day1;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=546735;
		int sum=0;
		int count=0;
		int copy=n;
		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				count++;
			}
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		System.out.println(count);
		if(sum==copy)
		{
			System.out.println((copy+" is an armstrong"));
		}
		else
		{
			System.out.println((copy+"isnot an armstrong"));
		}

	}

}
