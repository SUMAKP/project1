package ninety;

import java.util.HashMap;

public class CountRepeatedWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="karnataka";
		char[] ar = s.toCharArray();
	HashMap<Character, Integer>l=new HashMap<Character, Integer>();
	
	for(char a:ar)
	{
		if(!l.containsKey(a))
		{
			l.put(a, 1);
		}
		else
		{
			int count=l.get(a);
			count++;
			l.put(a,count);
		}
	}
	System.out.println(l);
	}

}
