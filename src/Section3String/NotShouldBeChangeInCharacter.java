package Section3String;

import java.util.HashSet;
import java.util.Set;

public class NotShouldBeChangeInCharacter {
  public static void main(String[] args) {
	String s="123";
	char[] ch=s.toCharArray();
	Set<Character> a1=new HashSet<Character>();
	for(char c:ch) {
		a1.add(c);
	}
	
   for(char c:a1) {
	  // int n=c-'0';
	   //int n=c-48;
	   int n = Integer.parseInt(String.valueOf(c));
      // int n = Character.getNumericValue(c);
	   System.out.println(n/2);
	   n=0;
   }
  }
}
