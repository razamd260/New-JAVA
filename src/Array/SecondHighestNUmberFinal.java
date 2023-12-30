package Array;

public class SecondHighestNUmberFinal {

	public static void main(String[] args) {
		int[] arr= {9,3,6,5,7};
		 int firstMax = arr[0];
	        int secondMax = arr[1];

	        for (int i = 2; i < arr.length; i++) {
	            if (firstMax < arr[i]) {
	                secondMax = firstMax;
	                firstMax = arr[i];
	            } else if (arr[i] > secondMax && arr[i] < firstMax) {
	                secondMax = arr[i];
	            }
	        }
	System.out.println(secondMax);
	}

}
