package Section3String;

import org.junit.jupiter.api.Test;

public class Object {
	int n=10;
	public static void main(String[] args) {
        Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj));
        System.gc();
	}

   
	public String toString() {
		return "Md";
	}

	public int hashCode() {
		return 1234;
	}

	public boolean equals() {
		return true;
	}
}
