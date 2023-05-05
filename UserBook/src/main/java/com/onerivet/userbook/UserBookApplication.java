package com.onerivet.userbook;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserBookApplication.class, args);
	}
	
	
	@Bean
	public ModelMapper modelmapper()
	{
		return new ModelMapper();
	}

}
