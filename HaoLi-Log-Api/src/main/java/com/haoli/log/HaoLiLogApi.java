package com.haoli.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class HaoLiLogApi {
	
	public static void main(String[] args) {
		ApplicationContext haoliLogApp = SpringApplication.run(HaoLiLogApi.class,args);
	}

}
