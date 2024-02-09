package ArraySomething;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
    	int[] numbers = {1, 3, 4, 5, 7};
    	int[] copy = Arrays.copyOf(numbers, 3);
    	System.out.println(Arrays.toString(copy));
	}
}
