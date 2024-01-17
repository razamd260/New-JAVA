package Number;

public class ArmStrongNumber {
     
	public static void main(String[] args) {
		int num=153;int rem=0;double sum=0;
		//String s=Integer.toString(num);
		String s=String.valueOf(num);
		int n=s.length();
		System.out.println("Length of Num : "+n);
		while(num>0) {
			rem=num%10;
			sum=(double) (sum+Math.pow(rem, n));
			num=num/10;
		}
	System.out.println(sum);
	}
}
