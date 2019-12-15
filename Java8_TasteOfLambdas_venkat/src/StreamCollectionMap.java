import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;
public class StreamCollectionMap 
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
		
		// create a Map with name & age as key, and the person as value.
		System.out.println(
				people.stream()
				      .collect(toMap(
				    		  person ->person.getName() + "_" + person.getAge(),   // 1st person passing as key i.e, name & age
				    		  person -> person                                    //  2nd person passing as value i.e, whole person as a value
				      )));
		

	}

}
