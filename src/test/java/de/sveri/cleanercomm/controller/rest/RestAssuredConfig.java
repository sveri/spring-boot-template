package de.sveri.cleanercomm.controller.rest;

import static io.restassured.RestAssured.given;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.sveri.cleanercomm.Application;
import de.sveri.cleanercomm.controller.rest.UserLogin;
import de.sveri.cleanercomm.helper.JwtHelper;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest(value = "server.port=9099")
public abstract class RestAssuredConfig {

	@BeforeClass
	public static void configureRestAssured() throws Exception {
		RestAssured.port = 9099;
	}

	protected String getValidToken() {
		UserLogin userLogin = new UserLogin("admin", "admin");

		return JwtHelper.BEARER + given().contentType("application/json").body(userLogin, ObjectMapperType.JACKSON_2)
				.when().post("/apilogin").path("token");
	}

}
