package StringProgram;

public class StringAdd {
public static void main(String[] args) {
	String s="10a22b33";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==0&&s.charAt(i)==9) {
			System.out.println(s.charAt(i));
		}
	}
}
}
