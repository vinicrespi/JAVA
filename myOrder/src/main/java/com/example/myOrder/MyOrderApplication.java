package com.example.myOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class MyOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyOrderApplication.class, args);
	}

}
