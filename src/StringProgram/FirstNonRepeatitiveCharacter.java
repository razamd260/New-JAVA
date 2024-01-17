package StringProgram;


import java.util.*;

public class FirstNonRepeatitiveCharacter {
	public static void main(String[] args) {
	    String s="aabbcdef";
	   test(s);
	}
  
	public static void test(String s) {
		 char[] arr=s.toCharArray();
		    Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
	       for(char ch:arr) {
	    	   map.put(ch, map.getOrDefault(ch, 0)+1);
	       }
	     for(Map.Entry<Character, Integer> result:map.entrySet()) {
	    	 if(result.getValue()==1) {
	    		 System.out.println(result.getKey());
	    		 break;
	    	 }
	     }
	}
    
}
