package StringProgram;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
      String s1="silent";
      String s2="listen";
      //if these strings are equal then anagram
      char[] arr1=s1.toCharArray();
      char[] arr2=s2.toCharArray();
      
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      String actual=String.valueOf(arr1);
      String expected=String.valueOf(arr2);
    //  System.out.println(actual +" : "+expected);
      if(actual.equals(expected)) {
    	  System.out.println("Anagram");
      }else {
    	  System.out.println("Not Anagram");
      }
      System.out.println(second());;
	}
	////////////////second Way /////////////////
	public static boolean second() {
		String s1="silent";
	      String s2="listen";
	      char[] arr1=s1.toCharArray();
	      char[] arr2=s2.toCharArray();
	      Arrays.sort(arr1);
	      Arrays.sort(arr2);
	      return Arrays.equals(arr1, arr2);

	}
}
