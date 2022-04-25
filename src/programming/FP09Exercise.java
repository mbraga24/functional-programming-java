package programming;

import java.util.List;

public class FP09Exercise {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		int result = numbers.stream()
		.filter(number -> number % 2 != 0)
		.reduce(0, Integer::sum);
		
		System.out.println(result);
		
	}
}
