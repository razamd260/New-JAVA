package Section3String;

import java.util.*;
import java.util.Map.Entry;

public class ConvertMapToList {
    public static void main(String[] args) {
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		map.put('x', 2);
		map.put('c', 3);
		map.put('a', 1);
		Set<Entry<Character,Integer>> set=map.entrySet();
		List<Entry<Character, Integer>> a1=new ArrayList<Entry<Character,Integer>>(set);
		Collections.sort(a1, new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		for(Entry<Character,Integer> result:a1) {
			System.out.println(result.getKey() +" : "+result.getValue());
		}
	}
}
