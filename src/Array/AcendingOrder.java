package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class AcendingOrder {
	public static void main(String[] args) {
		String s="mkoijnbhu";
		char[] ch=s.toCharArray();
		int[] arr1= {45,8,8,5,4,0,1};
		int[] arr2= {45,8,8,5,4,0,1};
		int[] arr3= {45,8,8,5,4,0,1};
		Arrays.sort(arr1);
		for(int n:arr1) {
			System.out.println(n);
		}
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int array:arr2) {
			a1.add(array);
		}
	Collections.sort(a1);
     
	System.out.println(a1);
	TreeSet<Integer> a2=new TreeSet<Integer>();
	for(int i:arr3) {
		a2.add(i);
	}
	   for(int i1:a2) {
		  System.out.println(i1);
	   }
	}
}
