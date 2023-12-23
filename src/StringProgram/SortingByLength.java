package StringProgram;

import java.util.Arrays;

public class SortingByLength {
	public static void main(String[] args) {
		String s="nhdd bgd az xsrty cdmfbdjs";
		String[] arr=s.split(" ");
		int[] arr1 =new int[arr.length];
	  for(int i=0;i<arr.length;i++) {
		  arr1[i]=arr[i].length();
	  }
	  Arrays.sort(arr);
	 Arrays.sort(arr1);
	 for(int n:arr1) {
		 System.out.println(n);
	 }

     for(String s1:arr) {
    	 System.out.println(s1);
     }
	}
}
