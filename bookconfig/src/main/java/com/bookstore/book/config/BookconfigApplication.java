package com.bookstore.book.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BookconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookconfigApplication.class, args);
	}

}
