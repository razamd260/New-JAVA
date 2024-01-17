package Array;

import java.util.HashSet;
import java.util.*;

public class TwoArrayIntersection {
   //the list of common and distinct elements between Arr1 and Arr2.
	public static void main(String[] args) {
		int[] arr1= {1,3,5,6};
		int[] arr2= {1,4,5,7};
		Set<Integer> a1=new HashSet<Integer>();
		for(int first:arr1) {
			a1.add(first);
		}
		for(int second:arr2) {
			if(a1.contains(second)) {
				System.out.println(second);
			}
		}
	}
}
