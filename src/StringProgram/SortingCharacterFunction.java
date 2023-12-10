package StringProgram;

import java.util.Arrays;

public class SortingCharacterFunction {
	public static void main(String[] args) {
      String s="zaxscd";
      char[] ch=s.toCharArray();
	Arrays.sort(ch);
	System.out.println(ch);// same line
	for(char c:ch) {
		System.out.println(c);//one by one
	}
	}
}
