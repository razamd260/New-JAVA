package Number;

public class PerfactSqure {
  public static void main(String[] args) {
	for(int i=1;i<=100;i++) {
		for(int j=1;j<=100;j++) {
			if(i==j*j) {
				System.out.println(i);
			}
		}
	}
}
}
