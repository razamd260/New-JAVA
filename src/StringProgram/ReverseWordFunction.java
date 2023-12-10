package StringProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordFunction {
	public static void main(String[] args) {
		String s = "i am noushad";
		String[] arr=s.split(" ");
		ArrayList<String> a1=new ArrayList<String>();
		for(String s1:arr) {
			a1.add(s1);
		}
		int i=1;
	Collections.reverse(a1);
	StringBuilder build=new StringBuilder();
	for(String s1:a1) {
		if(i<a1.size()) {
			build.append(s1+" ");
			i++;
		}else {
			build.append(s1);
			i++;
			break;
		}
	
	}
	System.out.println(build);
	}
	
}
