package StringProgram;

public class CountAlphaNumericCharacterloop {
    public static void main(String[] args) {
		String s="razamd260@gmail.com";
		String alpha1="",numeric1="",character1="";
		int alpha=0,numeric=0,character=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				alpha++;
				alpha1=alpha1+s.charAt(i);
			}
		  }
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				numeric++;
				numeric1=numeric1+s.charAt(i);
			}
		  }
		
		for(int i=0;i<s.length();i++) {
			if(!(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9') ){
				character++;
				character1=character1+s.charAt(i);
			}
		  }
	System.out.println(alpha1+"   :"+alpha);
	System.out.println(numeric1+"   :"+numeric);
	System.out.println(character1+"   :"+character);
    }
}
