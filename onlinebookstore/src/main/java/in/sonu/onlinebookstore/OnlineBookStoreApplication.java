package in.sonu.onlinebookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineBookStoreApplication {

	public static void main(String[] args) {
		
		System.out.println("Start.........");
		SpringApplication.run(OnlineBookStoreApplication.class, args);
		System.out.println("Stop.........");
	}

}
