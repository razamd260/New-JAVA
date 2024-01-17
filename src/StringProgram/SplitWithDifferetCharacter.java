package StringProgram;

public class SplitWithDifferetCharacter {
     public static void main(String[] args) {
		String s="java.selenium.automation";
		String[] arr=s.split("\\."); // its Applicable For All Character 
		//String[] arr=s.split("[.]"); // its Applicable for All Character

    	 char[] ch=s.toCharArray();
		 for(String str:arr) {
			System.out.println(str);
		 }
		 StringBuilder result=new StringBuilder();
		 for(char str1:ch) {
			 if(str1==';') {
				 result.append(' ');
			 }else {
				 result.append(str1);
			 }
		 }
	   System.out.println("StringBuilder : "+result);
       }
}
