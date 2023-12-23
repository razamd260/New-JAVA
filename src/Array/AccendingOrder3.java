package Array;

public class AccendingOrder3 {
    
	public static void main(String[] args) {
		String s="799763210";
		char[] arr=s.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	}
}
