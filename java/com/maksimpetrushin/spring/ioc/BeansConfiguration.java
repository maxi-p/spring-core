package com.maksimpetrushin.spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
	@Bean
	public User2 user2() {
		User2 user = new User2();
		user.setFirstName("John");
		user.setLastName("Smith");
		return user;
	}
	
	@Bean("customUser")
	public User2 user3() {
		User2 user = new User2();
		user.setFirstName("William");
		user.setLastName("Jackson");
		return user;
	}
}