package Number;

public class Fibonacci {
  public static void main(String[] args) {
	int n1=0,n2=1,sum=0;
	  for(int i=1;i<=9;i++) {
		  System.out.println(n1);
		  sum=n1+n2;
		  n1=n2;
		  n2=sum;
		  
	  }

  
  }
}
