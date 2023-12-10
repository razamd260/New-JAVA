package Section3String;

import org.junit.jupiter.api.Test;

public class Object {

	public static void main(String[] args) {

		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		System.out.println(obj1.equals(obj1));

	}

	public String toString() {
		return "Md";
	}

	public int hashCode() {
		return 1234;
	}

	public boolean equals(Object obj1) {
		return true;
	}
}
