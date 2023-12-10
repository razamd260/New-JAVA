package StringProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordOwnPlaceFunction {
	public static void main(String[] args) {
		String s = "hello world";
		String[] arr = s.split(" ");
		String s1 = "";
		String s2 = "";
		ArrayList<Character> a1 = new ArrayList<Character>();
		ArrayList<Character> a2 = new ArrayList<Character>();
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				s1 = s1 + arr[i];
			} else {
				s2 = s2 + arr[i];
			}
		}
		char[] ch1 = s1.toCharArray();

		char[] ch2 = s2.toCharArray();
		for (char c1 : ch1) {
			a1.add(c1);
		}
		for (char c2 : ch2) {
			a2.add(c2);
		}
		Collections.reverse(a1);
		Collections.reverse(a2);
		s1 = "";
		s2 = "";
		for (char c3 : a1) {
			s1 = s1 + c3 + "";
		}
		for (char c4 : a2) {
			s2 = s2 + c4 + "";
		}
		System.out.println(s1 + " " + s2);
	}
}
