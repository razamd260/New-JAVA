package Interview;

public class S1 {
    public static void main(String[] args) {
    	String s="nou12 sha34d 260@gmail c45om";
    	String[] arr=s.split(" ");
    	for(String s1:arr) {
    		char[] ch=s1.toCharArray();
    		StringBuilder result=new StringBuilder();
    		for(char c:ch) {
    			if(Character.isDigit(c)) {
    				result.append(c);
    			}
    		 }
    		System.out.println(s1+" : "+result);
    	}


}
}
