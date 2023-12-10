package Map;

import java.util.*;

public class Remove {
	public static void main(String[] args) {
       Map<Integer, String> map=new HashMap<>();
       map.put(1, "NOUSHAD");
       map.put(4,"SAJAD");
       map.put(5,"SARFRAJ");
       
       map.remove(1);
       System.out.println(map);
	}
}
