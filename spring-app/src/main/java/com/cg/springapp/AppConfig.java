package com.cg.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.cg.springapp")
@PropertySource("app.properties")
public class AppConfig {

//	@Bean("internet-con")
//	public InternetConnection getInternetConnectionBean() {
//		InternetConnection connection = new InternetConnection();
//		return connection;
//	}
//	
//	
//	@Bean("laptop")
//	public Laptop getLaptopBean() {
//		Laptop laptop = new Laptop();
//		
//		laptop.setConnection(getInternetConnectionBean());	
//		
//		laptop.setBrand("HP");
//		laptop.setModel("Gaming Series");
//		laptop.setSerial("hps4567");
//		return laptop;
//	}
	
}

