package de.sveri.cleanercomm.web;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.sveri.cleanercomm.CleanercommApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CleanercommApplication.class)
@WebIntegrationTest(value = "server.port=9090")
//@SeleniumTest(baseUrl = "http://localhost:9090")
public class AdminTest {

//	@Autowired
	private  WebDriver driver;
	
//	@Rule
//    public ScreenShotOnFailure failure = new ScreenShotOnFailure(driver);
	
	@Before
    public void setup() {
        //ChromeDriverManager.setup();
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

// @RunWith(SpringJUnit4ClassRunner.class)
// @SpringApplicationConfiguration(classes = CleanercommApplication.class)
// @WebIntegrationTest(value = "server.port=9000")
// @SeleniumTest(driver = FirefoxDriver.class, baseUrl =
// "http://localhost:9000")
// public class AdminTest {
//
// @Autowired
// private WebDriver driver;
//
// private HomePage homePage;
//
// @Before
// public void setUp() throws Exception {
// homePage = PageFactory.initElements(driver, HomePage.class);
// }
//
// @Test
// public void containsActuatorLinks() {
// homePage.assertThat()
// .hasActuatorLink("autoconfig", "beans", "configprops", "dump", "env",
// "health", "info", "metrics", "mappings", "trace")
// .hasNoActuatorLink("shutdown");
// }
//
// @Test
// @Ignore
// public void failingTest() {
// homePage.assertThat()
// .hasNoActuatorLink("autoconfig");
// }
//
// }
