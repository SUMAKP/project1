package assignment_day2;

public class String_reverse2 {

	public static void main(String[] args) {
		String s="HELLO WORLD";
		String ar[]=s.split(" ");
		   for(int i=ar.length-1;i>=0;i--)
		   {
			   System.out.print(ar[i]+" ");
		   }
	}

}
