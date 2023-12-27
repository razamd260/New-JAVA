package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class A1 {
	public static void main(String[] args) {
		 String s="zkjdja chennai zkjdja chaennai chnnai";
         char[] arr=s.toCharArray();
       
         TreeSet<Character> a1=new TreeSet<Character>();
         for(char ch:arr){
             a1.add(ch);
         }
      for(char chh:a1){
          System.out.println(chh);
      }
    
	}
}
