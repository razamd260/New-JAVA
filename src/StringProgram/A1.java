package StringProgram;

import java.util.Arrays;
import java.util.Map.Entry;

import javax.net.ssl.SSLContext;

import java.util.*;

public class A1 {
	public static void main(String[] args) {
		//int[] arr= {3,6,8,2,15};
	    String s="arg i am noushad";
	    String temp="";
	    String[] arr=s.split(" ");
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=i+1;j<arr.length;j++) {
	    		  if(arr[i].length()> arr[j].length()) {
	    			  temp=arr[i];
	    			  arr[i]=arr[j];
	    			  arr[j]=temp;
	    			  
	    		  }
	    	}
	    }
	    
	for(String str:arr) {
		System.out.println(str);
	}
		
		 
	}
}
