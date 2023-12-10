package Number;

public class HappyNumber {
	public static void main(String[] args) {
      int num=8;
      int sum=0,rem=0;
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
     
	if(num==1) {
		System.out.println("Happy Number");
	}
	else {
		System.out.println("Not Happy Number");
	  }
	}
}
