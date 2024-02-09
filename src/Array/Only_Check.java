package Array;

public class Only_Check {
	public static void main(String[] args) {
		//////////////////////////////////////////////////////////////////////////
		String s="I AM MD NOUSHAD ANSARI";
		String[] arr=s.split("[ ]");
		for(String str:arr) {
			 char[] ch=str.toCharArray();
			 for(char c:ch) {
				 System.out.println("First Latter of "+str+" is : "+c);
				 break;
			 }
		}
	///////////////////////////////////////////////////////////////////////
		
	}
}
