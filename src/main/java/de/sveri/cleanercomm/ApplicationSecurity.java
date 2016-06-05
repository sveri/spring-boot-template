package de.sveri.cleanercomm;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login").permitAll().anyRequest().fullyAuthenticated().and().formLogin()
				.loginPage("/login").failureUrl("/login?error").and().logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).and().exceptionHandling()
				.accessDeniedPage("/access?error");
	}

}