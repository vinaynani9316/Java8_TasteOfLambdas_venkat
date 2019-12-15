import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class StreamGroupingAndMapping 
{
	public static List<Person> createPeople()
	{
		return Arrays.asList(
		 new Person("Sara", "F", 20),
		 new Person("Sara", "F", 22),
		 new Person("Bob", "M", 20),
		 new Person("Paula", "F", 32),
		 new Person("Paul", "M", 32),
		 new Person("Jack", "M", 2),
		 new Person("Jack", "M", 22),
		 new Person("jill", "F", 12)
		                    );
	}

	public static void main(String[] args) 
	{
		List<Person> people = createPeople();
		
		//given a list of people, create a map where
		//their name is the key & value is all the people with that name.
		System.out.println(
		people.stream()
		      .collect(groupingBy(Person::getName)));
		
		//their name is the key & value is all the ages of people with that name
		System.out.println(
				people.stream()
				      .collect(groupingBy(Person::getName,
				    		  mapping(Person::getAge, toList()))));
		
	}
		

}
