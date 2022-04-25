package programming;

import java.util.List;

/*
 * Cube every number in a list and find the sum of cubes
 */

public class FP08Exercise {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		int result = numbers.stream()
				.map(number -> number * number * number)
				.reduce(0, Integer::sum);
		
		System.out.println(result);
		
	}
}
