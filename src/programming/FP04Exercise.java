package programming;

import java.util.List;

/*
 * Print Courses Whose Name has at least 4 letters
 */

public class FP04Exercise {

	public static void main(String[] args) {
		
		Integer MINIMUM_VALUE = 4;
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		courses.stream()
		.filter(str -> str.length() >= MINIMUM_VALUE)
		.forEach(System.out::println);
	}

}
