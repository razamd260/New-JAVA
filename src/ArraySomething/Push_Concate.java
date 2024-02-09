package ArraySomething;

import java.util.Arrays;

public class Push_Concate {
      public static void main(String[] args) {
    	  int[] arr = {0, 1, 0, 3, 12,4,0};

          moveZeros(arr);

          // Display the modified array
          for (int element : arr) {
              System.out.print(element + " ");
          }
      }

      public static void moveZeros(int[] arr) {
          int index = 0;
      
          // Move non-zero elements to the beginning
          for (int i = 0; i < arr.length; i++) {
              if (arr[i] != 0) {
                  arr[index++] = arr[i];
              }
          }

          // Fill remaining positions with zeros
         while(index<arr.length) {
        	 arr[index++]=0;
         }

      }
}
