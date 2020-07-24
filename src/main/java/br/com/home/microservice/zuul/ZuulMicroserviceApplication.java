package br.com.home.microservice.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulMicroserviceApplication.class, args);
	}

}
