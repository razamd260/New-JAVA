package Section3String;

public class FindClass$PackageName {
	
	public void test() {
		String className   = this.getClass().getPackageName();
		String packageName = this.getClass().getSimpleName();
		System.out.println(className);
		System.out.println(packageName);
	}
    public static void main(String[] args) {
    	FindClass$PackageName a1=new FindClass$PackageName();
    	a1.test();
	}
}
