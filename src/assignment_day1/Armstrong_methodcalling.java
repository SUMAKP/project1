package assignment_day1;

public class Armstrong_methodcalling {
	static void printsum(int n)
	{
		int sum=0;
		int copy=n;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==copy)
		{
			System.out.println(copy+"is armstrong");
		}
		else
		{
			System.out.println(copy+"is not anarmstrong");
		}
		
	}

	public static void main(String[] args) {
		
		Armstrong_methodcalling.printsum(345621);

	}

}
