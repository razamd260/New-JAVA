package Number;

public class Plindrome {
	public static void main(String[] args) {
		int num=123;
		int rem=0, sum=0;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println("Palondrome of this number :- "+sum);
	}
}
