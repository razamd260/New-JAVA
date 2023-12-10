package Number;

public class Armstrong {
	public static void main(String[] args) {
        int num=371;int temp=num,rem=0,cube=0,sum=0;
        while(num>0) {
        	rem=num%10;
        	cube=rem*rem*rem;
        	sum=sum+cube;
        	num=num/10;
        }
       if(temp==sum) {
    	   System.out.println("Armstrong number :- "+sum);
       }
	}
}
