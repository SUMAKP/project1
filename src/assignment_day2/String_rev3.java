package assignment_day2;

public class String_rev3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HELLO WORLD GOOD MORNING";
		String[] s1=s.split(" ");
		   for(int i=0;i<=s1.length-1;i=i++)
		   {
			   System.out.print(reverse(s1[i]));
		   }

	}
	static String reverse(String ar)
	{
		String reverse=" ";
		for(int i=ar.length()-1;i>=0;i--)
		{
			reverse=reverse+ar.charAt(i);
		}
		 return reverse;
	}
	}
 
