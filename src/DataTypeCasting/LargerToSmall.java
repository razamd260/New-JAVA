package DataTypeCasting;

public class LargerToSmall {
    public static void main(String[] args) {
		//double a=2837.86;
		long a=98l;
		//int result=(int)a;
		char result=(char)a;
		System.out.println(result);
		int demo=97;
		char s=(char) demo;
		System.out.println(s);
		String s1="42526";
		char[] ch=s1.toCharArray();
		for(char c:ch) {
			int num=c;
			System.out.println(num-'0');
		}
	}
}
