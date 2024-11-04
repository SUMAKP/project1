package ninety;


public class String_palindrome 
{

	public static void main(String[] args) 
	{
		String s="mom mom";
		String rev1="";
		String ar[]=s.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			String reverse="";
			String h=ar[i];
			for(int j=h.length()-1;j>=0;j--)
			{
				reverse=reverse+h.charAt(j);// TODO Auto-generated method stub
			}
		rev1=reverse+" ";
		System.out.print(rev1);
		}
if(s==rev1)
{
	System.out.println("palindrome\n");
}
else
{
	System.out.println("not palindrome\n");
}
	

	}

}
