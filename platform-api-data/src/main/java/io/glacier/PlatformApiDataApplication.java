package io.glacier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

public class PlatformApiDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformApiDataApplication.class, args);
	}

}
