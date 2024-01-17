package StringProgram;

public class PrintEvenLength {
    public static void main(String[] args) {
		String s="we are going to bokaro";
		String[] arr=s.split(" ");
		for(String str:arr) {
			if(str.length()%2==0) {
				System.out.println(str);
			}
		}
	}
}
