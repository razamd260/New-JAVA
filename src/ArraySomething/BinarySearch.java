package ArraySomething;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
    	int[] numbers = {1, 3, 4, 5, 6,7};
    	int index = Arrays.binarySearch(numbers, 6);
    	System.out.println(index);
	}
}
