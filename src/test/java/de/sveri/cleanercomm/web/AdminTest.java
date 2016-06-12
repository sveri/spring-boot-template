package de.sveri.cleanercomm.web;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.sveri.cleanercomm.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest(value = "server.port=9090")
public class AdminTest {

	private  WebDriver driver;
	
	
	@Before
    public void setup() {
        driver = new HtmlUnitDriver();
    }

	@Test
	public void TestStore() {
		driver.get("localhost:9090");
		driver.findElement(By.id("TagName_s"));
		String ret_msg = driver.findElement(By.id("ret_msg")).getText();
		assert ret_msg.equals("Succesfully Stored");
	}

	@Test
	public void TestStoreTwo() {
		driver.get("localhost:9090");
		driver.findElement(By.id("TagName_s"));
		String ret_msg = driver.findElement(By.id("ret_msg")).getText();
		assert ret_msg.equals("Succesfully Stored");
	}
	
	@After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
