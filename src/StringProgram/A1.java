package StringProgram;

public class A1 {
	public static void main(String[] args) {
        String s="noushad";
        StringBuilder result=new StringBuilder();
        char[] ch=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--) {
        	result.append(ch[i]);
        }
	System.out.println(result);
	}
}
