package StringProgram;

public class StringAdd {
public static void main(String[] args) {
	String s="10a22b33";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			System.out.println(s.charAt(i));
		}
	}
	System.out.println();
	for(int i=0;i<s.length();i++) {
		int n=s.charAt(i)-'0';
		if(n>=0 && n<=9) {
			System.out.println(n);
		}
	}
}
}
 