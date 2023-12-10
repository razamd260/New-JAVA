package StringProgram;

import java.util.HashSet;
import java.util.Set;

public class CharDuplicateRemoveFunction {
    public static void main(String[] args) {
		String s="raza md noushad ansari";
		char[] ch=s.toCharArray();
		Set<Character> a1=new HashSet<Character>();
		for(char c:ch) {
			if(c!=' ') {
				a1.add(c);
			}
			
		}
	for(char c1:a1) {
		System.out.println(c1);
	}
    }
}
