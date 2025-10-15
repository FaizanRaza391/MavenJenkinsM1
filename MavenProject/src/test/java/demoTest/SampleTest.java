package demoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void sub() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		driver.close();
	}
}
