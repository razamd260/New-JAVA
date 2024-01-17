package Array;

import java.util.*;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 1 ,7,9};
		
		Set<Integer> a1 = new HashSet<Integer>();
		for (int n : arr) {
			a1.add(n);
		}
		int n=arr[arr.length-1];
        for(int i=1;i<=n;i++) {
        	if(!a1.contains(i)) {
        		System.out.println(i);
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