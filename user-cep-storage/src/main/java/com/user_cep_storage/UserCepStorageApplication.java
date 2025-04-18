package com.user_cep_storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UserCepStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCepStorageApplication.class, args);
	}

}
