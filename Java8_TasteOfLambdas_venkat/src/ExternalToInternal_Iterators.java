import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExternalToInternal_Iterators 
{
	public static void main(String[] args) 
    {
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//external iterators
		for(int i=0; i<numbers.size(); i++)
			System.out.println(numbers.get(i));
		
	   // internal iterators
		numbers
		.forEach(System.out::println); // println is instance ()
		
		//internal iterator
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer value) 
			{
				System.out.println(value);
		    }
			
		});
		
		//method Reference
		numbers.stream()
	//	.map(e-> String.valueOf(e))
		.map(String::valueOf) // here parameter is argument & static ()
		.forEach(System.out::println);
		
		numbers.stream()
		.map(e-> String.valueOf(e))
	//	.map(e->e.toString()) // here parameter is target
		.map(String::toString)  // Here instance ()
		.forEach(System.out::println);
	}

}
