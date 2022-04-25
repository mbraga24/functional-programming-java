package programming;

import java.util.List;

/*
 * Print Only Odd Numbers from the List
 */

public class FP01Exercise {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		printOddNumbersFromList(numbers);

	}

	private static void printOddNumbersFromList(List<Integer> numbers) {
		
		numbers.stream()
		.filter(number -> number % 2 == 1)
		.forEach(System.out::println);
		
	}

}
