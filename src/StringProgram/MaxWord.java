package StringProgram;

public class MaxWord {
	public static void main(String[] args) {
		String s = "abd nhb vfd abd nhb vfd";
		String[] arr=s.split(" ");
		//int[] arr= {1,3,5,6,1,2};
		//char[] arr = s.toCharArray();
		  String max=arr[0];
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i].compareTo(arr[i])!=' ') {
				  if(max.compareTo(arr[i])<0) {
					  max=arr[i];
				  }
			  }
			 
		  }
		System.out.println(max);
	}
}
//paira na gal mere wasdi rhe 