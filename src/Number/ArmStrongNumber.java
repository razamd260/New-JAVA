package Number;

public class ArmStrongNumber {
     
	public static void main(String[] args) {
		int num=153;int rem=0;int sum=0;
		String s=Integer.toString(num);
		int n=s.length();
		while(num>0) {
			rem=num%10;
			sum=(int) (sum+Math.pow(rem, n));
			num=num/10;
		}
	System.out.println(sum);
	}
}
