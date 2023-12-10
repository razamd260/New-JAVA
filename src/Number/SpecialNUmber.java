package Number;

public class SpecialNUmber {
	public static void main(String[] args) {
      int num=40585,num1=145,temp=num,rem=0,sum=0;
      while(num>0) {
    	  int fact=1;
    	  rem=num%10;
    	  for(int i=1;i<=rem;i++) {
    		  fact=fact*i;
    	  }
    	  sum=sum+fact;
    	  num=num/10;
      }
	
	if(temp==sum) {
		System.out.println("Special numner is : "+sum);
	}
	else {
		System.out.println("Sorry "+sum);
	}
	
	}
}
