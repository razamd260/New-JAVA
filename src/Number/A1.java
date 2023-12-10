package Number;

import java.util.Scanner;

public class A1 {
	public static void main(String[] ali) {
      int num=94;int rem=0,sum=0;
      if(num==7) {
    	  System.out.println("Happy Number");
      }
      else {
    	  while(num>9) {
    		  sum=0;
    		  while(num>0) {
    			  rem=num%10;
    			  sum=sum+(rem*rem);
    			  num=num/10;
    		  }
    	     num=sum;
    	  }
      }
      if(num==1)
    	  System.out.println("Happy number");
      else
    	  System.out.println("Not Happy number");
	}
}
