package de.sveri.cleanercomm.controller.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.sveri.cleanercomm.Application;
import io.restassured.mapper.ObjectMapperType;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest(value = "server.port=9099")
public class LoginTest extends RestAssuredConfig {

	@Test
	public void login() throws Exception {
		UserLogin userLogin = new UserLogin("admin", "admin");

		given().contentType("application/json").body(userLogin, ObjectMapperType.JACKSON_2).when().post("/apilogin")
				.then().body("token", notNullValue());
	}

	@Test
	public void loginFailed() throws Exception {
		UserLogin userLogin = new UserLogin("admin", "wrong_password");

		given().contentType("application/json").body(userLogin, ObjectMapperType.JACKSON_2).when().post("/apilogin")
				.then().statusCode(401);
	}

}
