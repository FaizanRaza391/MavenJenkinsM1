package demoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo4Test {
	@Test
	public void case4() throws InterruptedException {
		
//		System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.quit();
	}
}
