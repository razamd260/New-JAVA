package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class A1 {
	public static void main(String[] args) {
		 String s="ACD";
         char[] arr=s.toCharArray();
       
         TreeSet<Character> a1=new TreeSet<Character>();
         for(char ch:arr) {
        	 a1.add(ch);
        	 
         }
      int n=arr[arr.length-1];
      System.out.println(n);
      
         for(int i=65;i<=90;i++) {
        	char c=(char)i;
        	if(!a1.contains(c)) {
        		System.out.println(c);
        	}
        	
         }
         
	}
}
