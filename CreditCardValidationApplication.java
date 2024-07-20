package codingtechniques;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "codingtechniques.controller")
public class CreditCardValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardValidationApplication.class, args);
	}

}
