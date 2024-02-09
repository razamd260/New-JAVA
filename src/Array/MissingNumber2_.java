package Array;

import java.util.*;

public class MissingNumber2_ {
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,6 };
		int sum=0;
		for(int n:arr) {
			sum=sum+n;
		}
		int n=arr[arr.length-1];
		int sum1=(n*(n+1))/2;
		int result=sum1-sum;
		System.out.println(result);
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