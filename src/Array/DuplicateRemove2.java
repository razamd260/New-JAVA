package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemove2 {
	public static void main(String[] args) {
        int[] arr= {1,4,6,8,3,4,8};
       Set<Integer> a1=new HashSet<Integer>();
       for(int a:arr) {
      	 a1.add(a);
       }
	System.out.println(a1);
	
	char[] arr1= {'a','g','i','b','b'};
	Set<Character> a2=new HashSet<Character>();
	for(char c:arr1) {
		a2.add(c);
	}
	System.out.println(a2);
	
	
	}
	
	
}
