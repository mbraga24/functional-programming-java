package programming;

import java.util.List;

public class FP07Exercise {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		int sum = addList(numbers);
		
		System.out.println(sum);
		
	}
	
	
//	private static int sum(int a, int b) {
//		return a + b;
//	}
	
	private static int addList(List<Integer> numbers) {
		
		// return numbers.stream()
		// .reduce(0, FP07Exercise ::sum);
		
		// implementing lambda expression
		
		return numbers.stream()
				.reduce(0, (a,b) -> a + b);
	
	}

}
