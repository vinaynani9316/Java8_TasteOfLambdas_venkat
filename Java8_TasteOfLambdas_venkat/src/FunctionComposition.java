import java.util.Arrays;
import java.util.List;

public class FunctionComposition {

	public static void main(String[] args) 
	{
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
          
		//given the values, double the even numbers & total
		
		int result =0;
//		
//		for(int i=0; i<=numbers.size(); i++ )
//		{
//			if(i%2 ==0) 
//				result += i*2;
//		
//		}
//		System.out.println(result);
		
		for(int e: numbers)
		{
			if(e%2==0)
			{
				result +=e*2;
			}
		}
		System.out.println(result);
		System.out.println("***************");
		
		System.out.println(                               // using java8
		numbers.stream()
		       .filter(e-> e%2==0)
//		       .map(e-> e*2)
//		       .reduce(0, Integer::sum));
		       .mapToInt(e -> e*2)
		       .sum());
	}

}
