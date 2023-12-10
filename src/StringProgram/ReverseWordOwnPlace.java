package StringProgram;

public class ReverseWordOwnPlace {
	public static void main(String[] args) {
		String s = "hello world";
		String[] arr = s.split(" ");
		String s1="";
		String s2="";
		for(int i=0;i<arr.length;i++) {
			s1=s1+arr[i];
			for(int j=s1.length()-1;j>=0;j--) {
				s2=s2+s1.charAt(j);
				
			}
		   s2=s2+" ";
		   s1="";
		}
	System.out.println(s2);
	}
}
