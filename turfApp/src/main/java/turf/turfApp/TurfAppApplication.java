package turf.turfApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import turf.turfApp.service.TurfService;

@SpringBootApplication
public class TurfAppApplication {


	public static void main(String[] args) {
		System.out.println("Hi all");
		SpringApplication.run(TurfAppApplication.class, args);
		System.out.println("hi bitches");
	}

}
