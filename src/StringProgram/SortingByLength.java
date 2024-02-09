package StringProgram;

import java.util.Arrays;

public class SortingByLength {
	public static void main(String[] args) {
		String s="nhdd bgd az xsrty cdmfbdjs";
		String[] arr=s.split(" ");
		String temp="";
		int[] arr1 =new int[arr.length];
	  for(int i=0;i<arr.length;i++) {
		   for(int j=i+1;j<arr.length;j++) {
			   if(arr[i].length()>arr[j].length()) {
				   temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	  }
	  for(String str:arr) {
		  System.out.println(str);
	  }
	 
	}
}
