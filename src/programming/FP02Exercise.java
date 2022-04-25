package programming;

import java.util.List;

/*
 * Print All Courses individually 
 * 
 * List<String> courses = List.of("Spring", "Spring Boot", "API" , 
 * 						"Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")
 */

public class FP02Exercise {

	public static void main(String[] args) {
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		courses.stream()
		.forEach(System.out::println);
				
	}

}
