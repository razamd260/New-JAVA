package Array;

import java.util.Arrays;
import java.util.Stack;

public class ReverseUsingStack {
    public static void main(String[] args) {
    	int[] arr= {3,6,8,2,15};
    	Stack<Integer> a1=new Stack<Integer>();
		for(int num:arr) {
			a1.push(num);
		}
		int brr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			brr[i]= a1.pop();
		}
	   System.out.println(Arrays.toString(brr));
	}
}
