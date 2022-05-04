package com.hexaware.eurekaclientwithhystrix3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientWithHystrix3Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientWithHystrix3Application.class, args);
	}

}
