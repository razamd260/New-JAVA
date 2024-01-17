package Array;

import java.util.*;

public class MissingCharcater {
	public static void main(String[] args) {
		 String s="ACD";
         char[] arr=s.toCharArray();
       
         TreeSet<Character> a1=new TreeSet<Character>();
         for(char ch:arr) {
        	 a1.add(ch);
        	 
         }
      int n=arr[arr.length-1];
         for(int i=65;i<=90;i++) {
        	char c=(char)i;
        	if(!a1.contains(c)) {
        		System.out.println(c);
        	}
        	
         }
	}
}






















/*
 * import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbersFinder {
    public static void main(String[] args) {
        // Given array
        int[] array = {1, 3, 5, 6};

        // Find and output the missing numbers
        List<Integer> missingNumbers = findMissingNumbers(array);
        System.out.println("The missing numbers are: " + missingNumbers);
    }

    static List<Integer> findMissingNumbers(int[] arr) {
        Arrays.sort(arr);

        List<Integer> missingNumbers = new ArrayList<>();

        // Check for missing numbers in the sorted array
        for (int i = arr[0] + 1; i < arr[arr.length - 1]; i++) {
            if (Arrays.binarySearch(arr, i) < 0) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }
}

*/