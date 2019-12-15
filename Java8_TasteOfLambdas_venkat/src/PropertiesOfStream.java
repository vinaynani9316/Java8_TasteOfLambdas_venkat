import java.util.Arrays;
import java.util.List;

public class PropertiesOfStream {

	public static void main(String[] args) 
	{
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,1,2,3,4,5);
		
		numbers.stream()
		       .filter(e->e% 2==0)
		       .forEach(System.out::println);
		// sized, ordered, non-distinct, non-sorted
		
		System.out.println("**************");
		
		numbers.stream()
	       .filter(e->e% 2==0)
	       .sorted()                 // we sort using sorted() of stream
	       .forEach(System.out::println);
		// sized, ordered, non-distinct, sorted
		
		System.out.println("**************");
		
		numbers.stream()
	       .filter(e->e% 2==0)
	       .distinct()                 // we can distinct the elements by distinct() of stream
	       .forEach(System.out::println);
		// sized, ordered, distinct, sorted
		

	}

}
