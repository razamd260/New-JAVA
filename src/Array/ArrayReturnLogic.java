package Array;

import java.util.Arrays;

public class ArrayReturnLogic {
	public static void main(String[] args) {
		  String s="mainhsva";
		  char[] a=test(s);
		  System.out.println(Arrays.toString(a));
	
	}
      public static char[] test(String s) {
         char[] arr=s.toCharArray();
         char[] result=new char[arr.length];
	       Arrays.sort(arr);
	       int index=0;
	       for(char ch:arr) {
	    	 result[index]=ch;
	    	 index++;
	       }
	     return result;
      }
}
