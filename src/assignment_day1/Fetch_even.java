package assignment_day1;

public class Fetch_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=54676102;
		
		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				System.out.println(rem);
			}
			n=n/10;
		}
	}

}
