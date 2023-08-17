package dev.priyanshu.moviesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesapiApplication.class, args);
	}

	// Get Endpoint
	// Get resembles GET HTTP method
	@GetMapping("/")
	public String apiRoot() {
		return "Welcome to Movies API";
	}

}
