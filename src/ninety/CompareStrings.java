package ninety;
import java.util.HashSet;
import java.util.Set;

public class CompareStrings 
{

    public static boolean compareStrings(String str1, String str2) {
        // Convert both strings to lowercase and split into words
        String[] words1 = str1.toLowerCase().split("\\s+");
        String[] words2 = str2.toLowerCase().split("\\s+");

        // Use a Set to store words from the first string
        Set<String> wordSet = new HashSet<>();
        for (String word : words1) {
            wordSet.add(word);
        }

        // Check if any word from the second string matches a word in the first string
        for (String word : words2) {
            if (wordSet.contains(word)) {
                return true; // Found a matching word
            }
        }

        return false; // No matching words found
    }

    public static void main(String[] args) {
        // Test cases
        String str1 = "Hello world";
        String str2 = "world peace";
        String str3 = "Goodbye moon";

        // Compare strings and print results
        if (compareStrings(str1, str2)) {
            System.out.println("Test case 1: Passed");
        } else {
            System.out.println("Test case 1: Failed");
        }

        if (compareStrings(str1, str3)) {
            System.out.println("Test case 2: Passed");
        } else {
            System.out.println("Test case 2: Failed");
        }
    }
}
