import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class StreamCollections {

	public static void main(String[] args) 
	{
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,1,2,3,4,5);
		
		//Double the even values & put that in to a list
		
		//** 1) wrong way to do this.
		List<Integer> doubleOfEven =new ArrayList<>();
		
		numbers.stream()
		       .filter(e-> e%2 ==0)
		       .map(e -> e*2)
		       .forEach(e-> doubleOfEven.add(e));
		System.out.println(doubleOfEven);
		// mutability is ok, sharing is nice, shared mutability is devils work       
        
		//** 2) write way to do this
		Set<Integer> doubleOfEven2 =
		
		numbers.stream()
		       .filter(e-> e%2 ==0)
		       .map(e-> e*2)
		      // .collect(toList())           // it is a reduce function
		       .collect(toSet());   // set does not accept duplicate values i.e stream are immutable.
		System.out.println(doubleOfEven2);
		
	}

}
