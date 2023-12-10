package Section3String;

public class string {
	public static void main(String[] args) {
		String s = new String("NOUSHAD");
		String s1 = "NOUSHAD";
		System.out.println(s1.toString());
		System.out.println(s.toString());
		System.out.println(s1.equals(s));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		test();
	}
	
	public static void test() {
		System.out.println("Test method Start....................");
		String s=new String("MD");
		s.concat("NOUSHAD");
		System.out.println(s);
		
		StringBuilder build=new StringBuilder("MD");
		build.append(" NOUSHAD");
		System.out.println(build);
				
		StringBuffer build1=new StringBuffer("MD");
		build1.append(" NOUSHAD");
		System.out.println(build1);
	}
	
	
}
