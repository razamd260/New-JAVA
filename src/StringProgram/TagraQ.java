package StringProgram;

public class TagraQ {
	public static void main(String[] args) {
		 String s="i am noushad ansari";
		  String[] arr=s.split(" ");
		 StringBuilder result=new StringBuilder();
		  for(String str:arr) {
			    result.append(str.substring(0, 1).toUpperCase()).
			    append(str.substring(1).toLowerCase()).
			    append(" ");
			    
		     }
	System.out.println(result);
	}
}
