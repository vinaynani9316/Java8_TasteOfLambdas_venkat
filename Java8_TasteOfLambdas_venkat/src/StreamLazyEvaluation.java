import java.util.Arrays;
import java.util.List;

public class StreamLazyEvaluation 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		//given an ordered list find the double of the first even number greater than 3.
		
		// imperative style
		int result=0;
		for(int e : numbers)
			if(e>3 && e % 2==0)
			{
				result =e*2;
				break;
			}
		System.out.println(result);
		
		// declarative style
		System.out.println(                       // it will take all the elements in to consideration & evaluate so performance reduces
				numbers.stream()
				       .filter(e-> e>3)
				       .filter(e-> e%2==0)
				       .map(e-> e*2)
				       .findFirst()
				);
		
		System.out.println(                   // it will take required elements in to consideration & evaluate so performance increases
				numbers.stream()
				       .filter(StreamLazyEvaluation::isGreaterThan3)       // pipelining the all the functions externally in to stream & will be idle, when we trigger
				       .filter(StreamLazyEvaluation::isEven)    // a method like *findFirst* then it will perform action.(Lazy evaluation)
				       .map(StreamLazyEvaluation::doubleIt)
				       .findFirst()
				);
		System.out.println("DONE");
		
	}
	
	private static boolean isGreaterThan3(int number)
	{
		System.out.println("isGreaterThan3 " + number);          // to check operation performances.
		return number>3;
	}
	
	private static boolean isEven(int number)
	{
		System.out.println("isEven " + number);
		return number%2==0;
	}

	private static int doubleIt(int number)
	{
		System.out.println("doubleIt " + number);
		return number *2;
	}
}
