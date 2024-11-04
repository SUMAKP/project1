package ninety;

public class foreach {

	public static void main(String[] args) 
	{
		String s1="hello world";
		String s2="hello evening";
		String[] word1=s1.split(" ");
		String[] word2=s2.split(" ");
		for(int i=0;i<word1.length;i++)
		{
			for(int j=0;j<word2.length;j++)
			{
			if(word1[i]==word2[j])
			{
				System.out.println(word2[j]);
			}
			else
			{
				System.out.println("not present");
			}
		}
		
		

	}

}
}
