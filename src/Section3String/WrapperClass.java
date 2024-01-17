package Section3String;


public class WrapperClass {
	 public static void main(String[] args) {
			double d=387.92;
			
			/*
			 * Auto Boxing
			 */
			Double d1=d;//implicit
			Double d2=Double.valueOf(d);//explicity
			System.out.println(d2/2);
			
			
			/*
			 * Unboxing
			 */
			double d3=d2;
			double d4=d2.doubleValue();
			
		   char ch='5';
		   String s=String.valueOf(ch);
		   // We Can Convert every Preemitive into String using boxing
		   //String to preemetive using parse.
		    
			
			
			
		}
}
