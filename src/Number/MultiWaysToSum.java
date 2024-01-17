package Number;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MultiWaysToSum {
  /* Arrays.stream(arr).
   * average()  Return-> OptionalDouble    
   * findFirst()  Return-> OptionalInt
   * findAny()    Return-> OptionalInt
   * min()        Return-> OptionalInt
   * max()        Return-> OptionalInt
   * 
   * sum()        Return->  int 
   * count()      Return->  long
   */
	public static void main(String[] args) {
		int[] arr= {2,4,1,2,6,4,7,4};
              int sum1=Arrays.stream(arr).sum();
              System.out.println(sum1);
              
             int sum2 =IntStream.of(arr).sum();
             System.out.println(sum2);
             
             int sum3=Arrays.stream(arr).reduce((x,y)->x+y).getAsInt();
             System.out.println(sum3);
             
             int sum4=Arrays.stream(arr).reduce(Integer::sum).getAsInt();
             System.out.println(sum4);
             
             long sum=Arrays.stream(arr).summaryStatistics().getSum();
              System.out.println(sum);
              
       
	}
}
