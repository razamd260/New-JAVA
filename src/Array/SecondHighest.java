package Array;

public class SecondHighest {
   public static void main(String[] args) {
	int [] arr= {1,3,5,7,8,9,23 };
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	int max2=arr[0];
    for(int i=0;i<arr.length;i++) {
    	if(max!=arr[i] && max2<arr[i]) {
    		max2=arr[i];
    	}
    }
int max3=arr[0];
for(int i=0;i<arr.length;i++) {
	if(max!=arr[i] && max2!=arr[i] && max3<arr[i]) {
		max3=arr[i];
	}
}
System.out.println(max3);
   }
}
