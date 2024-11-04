package ninety;

import java.util.LinkedHashSet;

public class RemoveRepeatedCharacters {

	public static String removeDuplicates(String str) {
		

		       
		        LinkedHashSet<Character> set = new LinkedHashSet<>();
		        
		        
		        for (char c : str.toCharArray())
		        {
		            set.add(c);
		        }
		        
		      
		        String result = "";
		        for (char c : set) {
		            result += c; 
		        }
		        
		        return result;
		    }

		    public static void main(String[] args) {
		        String str = "my name is suma and i am taking automation interview";
		        System.out.print(removeDuplicates(str));  
		}


	}


