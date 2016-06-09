package de.sveri.cleanercomm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;

@Configuration
public class Thymeleaf {
	
	@Bean
	public SpringSecurityDialect springSecurityDialect(){
		return new SpringSecurityDialect();
	}

}
