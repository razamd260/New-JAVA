package Array;

import java.util.*;

public class MajorityNumber {
    public static void main(String[] args) {
		int [] arr= {1,3,4,6,8,7,7,8,7,8,7,7};
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int n:arr) {
			map.put(n, map.getOrDefault(n,0)+1);
		}
		int[] check=new int[arr.length];
		int index=0;
		for(Map.Entry<Integer, Integer> re:map.entrySet()) {
			check[index]=re.getValue();
			index++;
		}
		int basedon=Arrays.stream(check).max().getAsInt();
		
		for(Map.Entry<Integer, Integer> result:map.entrySet()) {
			if(basedon==result.getValue()) {
				System.out.println(result.getKey()+" : "+result.getValue());
			}
		}
	
    }
}
