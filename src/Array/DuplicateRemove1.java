package Array;

public class DuplicateRemove1 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,1,2,3,4,5,1,2,3,4};
		int j,i=0;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					break;
				}
			}
		if(i==j) {
			System.out.println(arr[i]);
		}
		}

	}
}
