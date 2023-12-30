package Array;

public class SecondNumberChatgpt {

	public static void main(String[] args) {
		  int[] myArray = {99,100,2,5,7,3,8,104};//{5, 12, 8, 3, 10};
	        int result = findSecondHighest(myArray);
	        System.out.println("Second-highest number: " + result);

	}

	  public static int findSecondHighest(int[] arr) {
//	        if (arr.length < 2) {
//	            System.out.println("Array must have at least two elements");
//	            return -1; // or handle as appropriate for your case
//	        }

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

	        return secondMax;
	    }

}
