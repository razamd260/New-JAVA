package StringProgram;

import java.util.Arrays;

public class SortingStringFunction {
	public static void main(String[] args) {
       String s="azs axs abc acd awd";
       String[] arr=s.split(" ");
       Arrays.sort(arr);
       for(String s1:arr) {
    	   System.out.println(s1);
       }
	}
}
