package com.formacionbdi.springboot.app.productosb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient 
@SpringBootApplication
public class SpringbrootServicioProductosB1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbrootServicioProductosB1Application.class, args);
	}

}
