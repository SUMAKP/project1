package ninety;

import java.util.HashSet;
import java.util.Set;

public class ContainsString 
{


	public static void main(String[] args) {
	String s1="hello world good morning";
	String s2="good evening";
	
	if(compareStrings(s1,s2))
	{
System.out.println("test case passed");
	}
	else
	{
		System.out.println("test case failed");
	}

}

	private static boolean compareStrings(String s1, String s2) 
	{
		
	String[] words1=s1.split(" ");
	String[] words2=s2.split(" ");
	//Set<String> wordSet = new HashSet<>();
	 Set<String> wordSet = new HashSet<>();
	for(String word: words1)
	{
		wordSet.add(word);
	}
	 for (String word : words2)
	 {
         if (wordSet.contains(word)) 
         {
             return true; // Found a matching word
         }
	
		
		return false;
	}
	return false;
	}
}

