package ninety;

public class Reverse {

	public static void main(String[] args) {
		String s="My name is suma";
		String ar[]=s.split(" ");
		String result="";
		for(int i=0;i<ar.length;i++)
		{
			char[] res = ar[i].toCharArray();
			for(int j=res.length-1;j>=0;j--)
			{
				result +=res[j];
				
			}
			 if (i < ar.length - 1) {
			        result += " "; 
			    }
		}
		System.out.println(result);

	}

}
