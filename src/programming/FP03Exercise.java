package programming;

import java.util.List;

/*
 * Print Courses Containing the word "Spring"
 */

public class FP03Exercise {

	public static void main(String[] args) {
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		courses.stream()
		.filter(str -> str.contains("Spring"))
		.forEach(System.out::println);
				
	}
	

}
