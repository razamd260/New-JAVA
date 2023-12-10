package StringProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringFunction1 {
    public static void main(String[] args) {
		String s="razamd";
	
		char[] ch=s.toCharArray();
		ArrayList<Character> a1=new ArrayList<Character>();
		for(char c:ch) {
			a1.add(c);
		}
		StringBuilder build=new StringBuilder();
	Collections.reverse(a1);
	for(char c1:a1) {
		build.append(c1);
	}
    System.out.println(build);
    }
}
