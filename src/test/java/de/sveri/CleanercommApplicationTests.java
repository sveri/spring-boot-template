package de.sveri;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import de.sveri.cleanercomm.CleanercommApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CleanercommApplication.class)
@WebAppConfiguration
public class CleanercommApplicationTests {

	@Test
	public void contextLoads() {
	}

}
