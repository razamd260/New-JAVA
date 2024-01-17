package Map;
import java.util.*;
public class A {
       public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Salman khan");
		map.put(3, "Amir Khan");
		map.put(2, "Shahrukh khan");
		map.put(new Integer(3), "Amitab Bachan");
		map.remove(3);
		for(Map.Entry<Integer, String> result:map.entrySet()) {
			System.out.println(result.getKey()+" : "+result.getValue());
			
		}
	}
}
