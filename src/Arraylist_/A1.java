package Arraylist_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A1 {
   public static void main(String[] args) {
	List<Integer> a1=new ArrayList();
	a1.add(2);
	a1.add(4);
	a1.add(6);
    Iterator itr1=a1.iterator();
    while(itr1.hasNext()) {
    	Object obj=itr1.next();
    	int n=Integer.parseInt(obj.toString());
    	System.out.println(n/2);
    }
    
    
    for(int i=0;i<a1.size();i++) {
    	Object obj=a1.get(i);
    	if(obj instanceof Integer) {
    		//int n1=(int)obj;
    		Integer n1=(Integer)obj;
    		System.err.println(n1/2);
    	}
    }
}
}
