package Map;


import java.util.*;

public class Iterator {
	public static void main(String[] args) {
      Map<Integer, String> map=new HashMap<>();
      map.put(1, "MD NOUSHAD");
      map.put(3, "MD SARFRAJ");
      for(Map.Entry<Integer, String> e: map.entrySet()) {
    	  System.out.println(e.getKey()+"    :   "+e.getValue());
      }
	}
}
