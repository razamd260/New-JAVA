package Interview;

public class ThisKeyWord {
     //int a=10;
     static int a=30;
     public static void main(String[] args) {
    	 ThisKeyWord t=new ThisKeyWord();
    	 t.test();
		
	}
     public void test(){
    	 int a=20;
    	 System.out.println(this.a);
     }
}
