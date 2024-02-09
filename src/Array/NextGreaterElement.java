package Array;

public class NextGreaterElement {
	public static void main(String[] args) {
		int[] arr= {6,8,1,3,6,8,2,15};
		
		for(int i=0;i<arr.length;i++) {
			int next=-1;
          for(int j=i+1;j<arr.length;j++) {
        	  if(arr[i]<arr[j]) {
        		  next=arr[j];
        		  break;
        	  }
          }
		System.out.println(next);
		}
		 
	}
}
