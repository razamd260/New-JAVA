package Section3String;

import java.util.*;

public class StackClass {
	public static void main(String[] args) {
		Stack<Integer> a1=new Stack<Integer>();
		int[] arr= {2,4,6,8,};
		for(int num:arr) {
			a1.add(num);
		}
		a1.push(60);
		System.out.println("after pushing "+"\n"+a1);
		a1.pop();
		System.out.println("after pop "+"\n"+a1);
		a1.pop();
		System.out.println("after pop "+"\n"+a1);
		a1.peek();
		System.out.println("after peek "+"\n"+a1);
		
		System.out.println("after search "+"\n"+a1.search(4));
	}
}
