package sn.mod.senegal.miscroAservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/greetings")
public class MiscroAServiceApplication {
	@GetMapping
	public String fetchGreeting() {
		return "Hello from MicroServiceA";
	}
	@PostMapping
	public String addGreeting(@RequestBody String greeting) {
		// Business logic to save the greeting typically to a DB table
		return "Greeting successfully saved";
	}
	public static void main(String[] args) {
		SpringApplication.run(MiscroAServiceApplication.class, args);
	}

}
