package Map;

import java.util.*;

public class ReplaceChange {
	public static void main(String[] args) {
       Map<Integer ,String> map=new HashMap<>();
       map.put(1, "Sikander");
       map.put(3, "Akber");
       map.put(4, "sarfraj");
       //changing
       map.put(3, new String("AZAD"));
       System.out.println(map);
       for(Map.Entry<Integer, String> e: map.entrySet()){
    	   System.out.println(e.getKey()  +"  :  "+e.getValue());
       }
	}
}
