package com.kotekaman.springmongo;

import com.kotekaman.springmongo.users.endusers.Address;
import com.kotekaman.springmongo.users.endusers.EndUser;
import com.kotekaman.springmongo.users.endusers.EndUsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.ZonedDateTime;

@SpringBootApplication
public class SpringMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoApplication.class, args);
	}


}
