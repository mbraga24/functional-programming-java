package programming;

import java.util.List;
import java.util.stream.Collectors;

/*
 * Create a List with Even Numbers Filtered from the Numbers List
 */

public class FP10Exercise {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		List<Integer> evenNumbers = evenList(numbers);
		
		System.out.println(evenNumbers);

	}
	
	private static List<Integer> evenList(List<Integer> numbers) {
		
		return numbers.stream()
				.filter(number -> number % 2 == 0)
				.distinct()
				.collect(Collectors.toList());  // collect all the results from map into a List
	}

}
