package StringProgram;

public class CharDuplicateRemoveloop {
	public static void main(String[] args) {
       String s="mjmjmjnhnhnhnhbgbgbg";
       int i=0;
       int j=0;
        for(i=0;i<s.length();i++) {
        	for(j=0;j<s.length();j++) {
        		if(s.charAt(i)==s.charAt(j)) {
        			break;
        		}
        	}
        
        	if(i==j) {
        		System.out.println(s.charAt(i));
        	}
        }
	
	}
}
