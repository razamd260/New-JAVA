package Map;

import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		Map<Integer,String> map = new TreeMap();
		map.put(6,"MD NOUSHAD");
		map.put(1,"MD SIKANDER");
		map.put(new Integer(2), "MD AKBER");
		map.put(new Integer(6), "NUll");
		map.put(6, new String("MD NOUSHAD"));
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			  System.out.println(e.getKey() + " : "
	                  + e.getValue()); 
		}

	}
}
