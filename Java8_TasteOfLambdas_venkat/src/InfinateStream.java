import java.util.stream.Stream;


public class InfinateStream 
{
	public static int compute(int k, int n)
	{
//		// imperative
//		int result=0;
//		int index= k;
//		int count=0;
//		while(count <n)
//		{
//			if(index %2==0 && Math.sqrt(index) >20 )
//			{
//				result += index *2;
//				count++;
//			}
//			index++;
//		}
//		 return result;
		 
		// Declarative style using streams
		 return Stream.iterate(k, e-> e +1)
				      .filter(e->e%2 ==0)
				      .filter(e-> Math.sqrt(e) >20)
				      .mapToInt(e-> e*2)
				      .limit(n)
				      .sum();
	}

	public static void main(String[] args)
	{
		 System.out.println(Stream.iterate(100, e->e+1)); // output: ReferencePipeline$Head@816f27d, because the element is infinite,
		                                                 //& stream will not solve until any () initialized, it will collect as pipeline
		//starts will 100, create a series
		// 100,101,102,103, ...

		//now given a number k, and a count n, find the total of double of n even numbers starting with k, where square root of each number is > 20
		
		int k=121;
		int n=51;
		System.out.println(compute(k,n));
	}

}
