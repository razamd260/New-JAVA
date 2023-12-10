package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {
	 public static void main(String[] args) {
			HashMap<Integer,String> hashmap=new HashMap();
			hashmap.put(1, "MD NOUSHAD");
			hashmap.put(2, "MD SARFRAJ");
			System.out.println(hashmap);
			for (Entry<Integer, String> e : hashmap.entrySet()) {
				  System.out.println(e.getKey() + " : "
		                  + e.getValue()); 
			}
		}
}
