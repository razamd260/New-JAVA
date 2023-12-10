package Number;

public class Lcm {

	public static void main(String[] args) {
		int n1=7,n2=9;int lcm=0;
		for(int i=1;i>=0;i++) {
			if((i%n1==0) && (i%n2==0)) {
			 lcm=i;
			 break;
			}
		}
	System.out.println("Lcm Number Is :- "+lcm);
	}
}
