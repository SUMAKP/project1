package assignment_day1;
class sum1
{
	static void printsum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
}

public class Printsum_methodcallParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum1.printsum(34567);
	}

}
