package com.example.demo;

import io.swagger.annotations.SwaggerDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@SwaggerDefinition
@EnableSwagger2

public class KkanbuApplication {

	public static void main(String[] args) {
		SpringApplication.run(KkanbuApplication.class, args);
	}

}
