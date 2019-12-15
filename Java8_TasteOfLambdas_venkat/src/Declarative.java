import java.util.Arrays;
import java.util.List;

public class Declarative {

	public static void main(String[] args) 
	{
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// Declarative
		
		int result= numbers.stream()
				           .filter(number -> number >5)
				           .filter(number -> isEven(number))
				           .filter(number -> number<9)
				           .filter(number -> number*2 > 15) // 8*2= 16 so 16> 15 printing "8"
				           .findFirst()
				           .get();
		
		         System.out.println(result);
		}

	private static boolean isEven(Integer number) 
	{
		return number%2==0;
	}

}
