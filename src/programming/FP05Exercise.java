package programming;

import java.util.List;

/*
 * Print the cubes of odd numbers
 */

public class FP05Exercise {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.map(number -> number * number * number)
		.forEach(System.out::println);

	}

}
