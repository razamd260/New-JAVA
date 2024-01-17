package Annotation;

public class A {
 public static void main(String[] args) {
	int[] arr = {1,2,3,4,1,4,5,6,4};
	int[] brr= {2,4,5,3};
	
//	int size=brr.length+arr.length;
//	int[] crr=new int[size];
//	for(int i=0;i<arr.length;i++) {
//		crr[i]=arr[i];
//	}
	int count=0;
	for(int i=0;i<arr.length;i++) {
		count=0;
		for(int j=0;j<brr.length;j++) {
			if(arr[i]==brr[j] && arr[i]!=' ') {
			brr[j]=' ';
			count++;
			}
		  }
	if(count>0 && arr[i]!=' ') {
		System.out.println(arr[i]);
	}
	}
	
   }
}
