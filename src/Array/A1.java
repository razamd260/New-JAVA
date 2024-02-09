package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class A1 {
	public static void main(String[] args) {
	
		String s="Hello World";// output Heggi Wirgd
		String temp=s;
		int Originalnum=temp.length();
		s=s.replace("l", "g");
		s=s.replace("o", "i");
		int final1=s.length();
		//System.out.println(s);
		s=s.concat(" "+temp);
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int[] arr= {2,5,3,8};
		int index=0;
		for(int n:arr) {
			if(n!=3) {
				arr[index++]=n;
			    }
		   }
		for(int i=index;i<arr.length;i++) {		
				arr[index++]=3;
		}
         System.out.println(Arrays.toString(arr));*/
	}
}
