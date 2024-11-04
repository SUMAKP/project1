package assignment_day1;
public class Reverse_methodcall {
	// TODO Auto-generated method stub
	static void print(int n)
	{
		
		int rev=0;
		
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}
		
		



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_methodcall.print(435672);
	}

}
