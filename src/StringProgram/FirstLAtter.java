package StringProgram;

public class FirstLAtter {
	public static void main(String[] args) {
		String s="MD NOUSHAD ANSARI BANK MORE";
		String[] arr=s.split("[ ]");
		for(String str:arr) {
			 for(int i=0;i<str.length();i++) {
				 System.out.println(str.charAt(0));
				break;
			 }
		}
	}
}
