package Number;

public class Hcf {
   public static void main(String[] args) {
	int n1=7,n2=3;
	int hcf=0;
	if(n1>n2) {
		for(int i=n1;i>=1;i--) {
			if(n1%i==0 && n2%i==0) {
				hcf=i;
				break;
			}
		}
	}
	if(n1<n2) {
		for(int i=n2;i>=1;i--) {
			if(n1%i==0 && n2%i==0) {
				hcf=i;
				break;
			}
		}
	}

   System.out.println("HCF Number is :- "+hcf);
   }
}
