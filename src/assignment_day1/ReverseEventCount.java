package assignment_day1;

public class ReverseEventCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=546735;
		//int reverse=0;
		int count=0;
		while(n!=0)
		{
			int rem=n%10;
			
			if(n%2==0)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println("The Number of even numbers is"+count);

	}

}
