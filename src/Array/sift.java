package Array;

import java.util.Arrays;

public class sift {
    public static void main(String[] args) {
    	int[] arr= {2,5,3,8,4,2,6,8,7,3};
		int index=0;
		int last=arr.length-1;
		for(int n:arr) {
			if(n==2) {
			   
			}else {
				arr[index++]=n;
			}
		}
		for(int i=index;i<arr.length;i++) {
			arr[i]=2;
		}
	System.out.println(Arrays.toString(arr));
	}
}
