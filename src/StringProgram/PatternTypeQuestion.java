package StringProgram;

public class PatternTypeQuestion {
	public static void main(String[] args) {
		String s = "abc";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				s1 = s1 + s.charAt(j);
				System.out.println(s1);
			}
			s1 = "";
		}
		test();
	}

	public static void test() {
		System.out.println("----------------------Sccond-----------");
		String s = "abc";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i, j));
			}
		}

	}
}
