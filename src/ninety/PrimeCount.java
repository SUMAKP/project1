package ninety;

public class PrimeCount {
	public static void main(String[] args) {
		int sum=0;
		for(int j=1;j<=100;j++)
		{
			int n=j;
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(n);
			}
		}
		
	}

}
