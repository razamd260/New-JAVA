package StringProgram;

import java.util.Arrays;

public class CountAlphaNumericCharacterFunction {
	public static void main(String[] args) {
		String s="razamd260@gmail.com";
		char[] ch=s.toCharArray();
		StringBuilder s1=new StringBuilder();
		int c1=0;
		StringBuilder s2=new StringBuilder();
		int c2=0;
		StringBuilder s3=new StringBuilder();
		int c3=0;
		for(char c:ch) {
			if(Character.isAlphabetic(c)) {
				s1.append(c);
				c1++;
				
			}
		}
		for(char c:ch) {
			if(Character.isDigit(c)) {
				s2.append(c);
				c2++;
				
			}
		}
		for(char c:ch) {
			if(!(Character.isAlphabetic(c) || Character.isDigit(c))) {
				s3.append(c);
				c3++;
				
			}
		}
	System.out.println(s1+" : "+c1);
	System.out.println(s2+" : "+c2);
	System.out.println(s3+" : "+c3);

	
	}

}
