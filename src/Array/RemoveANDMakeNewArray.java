package Array;

import java.util.Arrays;

public class RemoveANDMakeNewArray {
	public static void main(String[] args) {
       int[] arr1= {1,2,3,4};
       int remove=3;
       System.out.println("Original Array :- "+Arrays.toString(arr1));
       int[] result=remove(remove,arr1);
       System.out.println("Final Array :- "+Arrays.toString(result));
	}
	public static int[] remove(int remove,int[] arr1) {
		int[] arr2=new int[arr1.length-1];
		int j=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=3) {
				arr2[j]=arr1[i];
				j++;
			}
			
		}
	return arr2;
	}
}
