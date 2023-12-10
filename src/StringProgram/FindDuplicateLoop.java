package StringProgram;

public class FindDuplicateLoop {
	public static void main(String[] args) {
       String s="my name is noushad ansari";
       char[] arr=s.toCharArray();
       int count=1;
       for(int i=0;i<arr.length;i++) {
    	   count=1;
    	   for(int j=i+1;j<arr.length;j++) {
    		   if(arr[i]==arr[j] && arr[i]!=' ') {
    			   count++;
    			   arr[j]=' ';
    		   }
    	   }
       if(count>1 && arr[i]!=' ') {
    	   System.out.println(arr[i]);
       }
       }
	}
}
