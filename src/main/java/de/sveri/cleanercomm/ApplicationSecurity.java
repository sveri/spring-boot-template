package de.sveri.cleanercomm;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableOAuth2Sso
//@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {

//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/");
////		super.configure(web);
//	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.antMatcher("/**").authorizeRequests()
		.antMatchers("/", "/login**").permitAll()
		.anyRequest().authenticated();
	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().
//		antMatchers("/", "/user/register").permitAll().
////		antMatchers("/admin").hasRole("Admin").
//		antMatchers("/login").permitAll().anyRequest().fullyAuthenticated().and().formLogin()
//				.loginPage("/login").failureUrl("/login?error").and().logout()
//				.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).and().exceptionHandling()
//				.accessDeniedPage("/access?error");
//	}

}