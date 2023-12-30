package StringProgram;

public class StringToStringAllPossible {

	public static void main(String[] args) {
		String a1="noushad";
		String a2="NOUSHAD";
		/*
		 *  noushad==NOUSHAD
		 */
		if(a1.equals(a2)) {
			System.out.println("== : true");
		}else {
			System.out.println("== : false");
		}
		
		/*
		 * noushad!=NOUSHAD
		 */
		if(!a1.equals(a2)) {
			System.out.println("!= : true");
		}else {
			System.out.println("!= : false");
		}
		
		/*
		 * compareToIgnoreCase
		 */
		String c1="abc";
		String c2="ABC";
		String c3="Kola";
	    int result;
		    result=c1.compareToIgnoreCase(c2);
		    System.out.println(result);
		    
		    result=c1.compareToIgnoreCase(c3);
		    System.out.println(result);
		    
		    result=c3.compareToIgnoreCase(c1);
		    System.out.println(result);
		
		/*
		 *  abc>zxc
		 */
		String b1="abc";
		String b2="zxc";
		if(0>b1.compareTo(b2)) {
			System.out.println("> : true");
		}else {
			System.out.println("> : false");
		}
		
		/*
		 *  abc<zxc
		 */
		if(0<b1.compareTo(b2)) {
			System.out.println("< : true");
		}else {
			System.out.println("< : false");
		}
		
		
	}

}
