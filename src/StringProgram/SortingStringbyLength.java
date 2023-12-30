package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class SortingStringbyLength {
	public static void main(String[] args){
	    
	       String[] arr={"abch","zxcrr","nhbhbh","k","as"};
	       String empty="";
	       int len=0;
	          for(int i=0;i<arr.length;i++){
	             for(int j=i+1;j<arr.length;j++){
	                 if(arr[i].length()>arr[j].length()){
	                       empty=arr[i];
	                       arr[i]=arr[j];
	                       arr[j]=empty; 
	                   }
	                }
	             }
	      
	         for(int i=0;i<arr.length;i++){
	        	 System.out.println(arr[i]+" : "+arr[i].length());
	          }  
	        
	     }
}
