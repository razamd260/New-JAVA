package Number;

public class SunnyNumber {
	public static void main(String[] args) {
      int num=12;int count=0;
      int num1=num+1;
      for(int i=1;i<=num1;i++) {
    	  if(num1==(i*i)) {
    		  count++;
    	  }
      }
	if(count>0) {
		System.out.println("Sunny Number");
	}
	else {
		System.out.println("Not Sunny Number");
	}
	
	
	}
}
