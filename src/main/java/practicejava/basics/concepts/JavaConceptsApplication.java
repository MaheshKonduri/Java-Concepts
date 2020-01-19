package practicejava.basics.concepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import practicejava.basics.concepts.arrays.CallingArraysConcepts;

@SpringBootApplication
public class JavaConceptsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaConceptsApplication.class, args);
		System.out.println("Application has been started in springboot:");
		CallingArraysConcepts callingArraysConcepts = new CallingArraysConcepts();
		callingArraysConcepts.callBasicArray();
	}

}
