package de.sveri.cleanercomm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringBootApplication
@EnableOAuth2Sso
public class CleanercommApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanercommApplication.class, args);
	}
}
