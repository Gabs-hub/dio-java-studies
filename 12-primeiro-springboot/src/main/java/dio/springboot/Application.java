package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		/*
		NÃO É ASSIM VIU, FI?
		Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.somar(2,7))1;
		*/
	}

}
