package programming;

import java.util.List;

/*
 * Print the number of characters in each course name
 */

public class FP06Exercise {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" , 
				  						"Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		courses.stream()
		.map(course -> course.length())
		.forEach(System.out::println);
	}

}
