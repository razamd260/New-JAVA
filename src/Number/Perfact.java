package Number;

public class Perfact {
  public static void main(String[] args) {
	int num=28,sum=0;
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			sum=sum+i;
		}
	}
System.out.println("Perfact Number :- "+sum);
  
  }
}
