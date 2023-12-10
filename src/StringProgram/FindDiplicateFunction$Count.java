package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class FindDiplicateFunction$Count {
	 public static void main(String[] args) {
	        String inputString = "ascdvfasasa";
	        findDuplicateChars(inputString);
	    }
            public static void findDuplicateChars(String str) {
	        // Create a HashMap to store character frequencies
	        Map<Character, Integer> charFrequency = new HashMap<>();

	        // Convert the string to a character array
	        char[] charArray = str.toCharArray();

	        // Iterate through each character in the array
	        for (char ch : charArray) {
	            // Update the frequency in the HashMap
	            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
	        }

	        // Print duplicate characters
	        System.out.println("Duplicate characters in the string:");
	        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
	            }
	        }
	    }
}
