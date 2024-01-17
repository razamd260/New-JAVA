package Array;

import java.util.HashSet;
import java.util.Set;

public class HighestNumber {
	public static void main(String[] args) {
      int[] arr= {1,3,5,2,9,5,3};
      int max=arr[0];
      for(int i=0;i<arr.length;i++) {
    	  if(max<arr[i]) {
    		  max=arr[i];
    	  }
      }
     
	System.out.println(max);
	}
}
