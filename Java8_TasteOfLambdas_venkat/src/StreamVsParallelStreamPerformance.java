import java.util.Arrays;
import java.util.List;

public class StreamVsParallelStreamPerformance {

	public static void main(String[] args)
	{
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		TimeIt.code(()->
		System.out.println(numbers.stream()          // stream will take 5.01 seconds()where as
				                 //.parallelStream()  //parallel stream will take only 2.15 seconds it activates multiple threads at a time.
				                  .filter(e-> e%2 ==0)    // (employability is more in parallel stream)
				                //.mapToInt(e->compute(e))  
				                  .mapToInt(StreamVsParallelStreamPerformance::compute)
				                  .sum()));
				
	}
	
	public static int compute(int number)
	{
		// assume this is the time intensive
		try {Thread.sleep(1000);  } catch (Exception e) {};
		return number*2;
	}

}
