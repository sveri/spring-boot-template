package de.sveri.cleanercomm.controller.rest;

import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class Login {
	
	@RequestMapping(value = "apilogin", method = RequestMethod.POST)
    public LoginResponse login(@RequestBody final UserLogin login)
        throws ServletException {
//        if (login.name == null || !userDb.containsKey(login.name)) {
//            throw new ServletException("Invalid login");
//        }
        return new LoginResponse(Jwts.builder().setSubject(login.name)
                .claim("roles", "sveri").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey").compact());
//        return new LoginResponse(Jwts.builder().setSubject(login.name)
//                .claim("roles", userDb.get(login.name)).setIssuedAt(new Date())
//                .signWith(SignatureAlgorithm.HS256, "secretkey").compact());
    }

    @SuppressWarnings("unused")
    private static class UserLogin {
        public String name;
        public String password;
    }

    @SuppressWarnings("unused")
    private static class LoginResponse {
        public String token;

        public LoginResponse(final String token) {
            this.token = token;
        }
    }

}
