package assignment_day1;

public class CountVowelsAndConsonanats {
	public static void main(String[] args) {
		
	
	String str="Automation";
	char ch[]=str.toCharArray();
	int vow=0;
	int con=0;
	for(char c:ch)
	{
	if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		vow++;
	}
	else
	{
		con++;
	}
	}
	System.out.println(vow +"  "+con);
	}

}
