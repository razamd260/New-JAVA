package WrapperClass;

import java.util.*;

public class AutoBoxing {

	public static void main(String[] args) {
       int a=10;
       Integer a1=a;
       Integer a11=Integer.valueOf(a);
       int i=a11.intValue();
       System.out.println(a1);
       System.out.println(a11);
       System.out.println(i);
         
	}

}
