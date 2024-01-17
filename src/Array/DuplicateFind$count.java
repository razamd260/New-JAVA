package Array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateFind$count {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 8, 7, 7, 8, 7, 8, 7, 7 };
		int[] final1 = new int[1];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : arr) {
			Integer val = map.get(i);
			if (val == null) {
				map.put(i, 1); //1=1,3=1,7=1,8=1  it fail bcz value 1+1+1
				
			} else {
				map.put(i, val + 1); //7=3
			}
		}
		for (Map.Entry<Integer, Integer> result : map.entrySet()) {
			if(result.getValue()>1) {
				 System.out.println(result.getKey()+" : "+result.getValue());
			}
        }
	}
}
