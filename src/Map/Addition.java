package Map;

import java.util.*;

public class Addition {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "SIKANDER");
		map.put(new Integer(2), "AKBER");
		map.put(null, new String("AZAD"));
		map.put(null, null);
		map.put(null, new String("AZAD"));
		
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			  System.out.println(e.getKey() + " : "
	                  + e.getValue()); 
		}
	}
}
