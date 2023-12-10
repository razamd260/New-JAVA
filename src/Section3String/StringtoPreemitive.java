package Section3String;



public class StringtoPreemitive {
	public static void main(String[] args) {
		StringBuilder build=new StringBuilder();
		build.append("786");
	    int n=Integer.parseInt(build.toString());
	    System.out.println(n);
        String s1="123";
        int n1=Integer.parseInt(s1.toString());
        if(n1%123==0) {
        	 System.out.println(n1);
        }
       
        String s2=new String("456");
        int n2=Integer.parseInt(s2);
        int n_=n2/2;
       System.out.println(n_);
       String s3="26";
       long l=Long.parseLong(s3);
       System.out.println(l/2);
       String s4="56678.98";
       double d=Double.parseDouble(s4);
       System.out.println(d/2);
       byte b=Byte.parseByte(s3.toString());
       System.out.println(b/2);
       short s=Short.parseShort(s3.toString());
       System.out.println(s/2);
       boolean b1=Boolean.parseBoolean(s3.toString());
        System.out.println(b1);
        char[] ch=s2.toCharArray();
        for(char c:ch) {
        	if(Character.isDigit(c)) {
        		System.out.println(c);
        	}
        }
	
	}
    
}
