package assignment_day1;

public class Reverse_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=67543;
		int rev=0;
		//int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);

	}

}
