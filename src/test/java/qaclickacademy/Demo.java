package qaclickacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("C:\\Way2Automation\\Extentreport\\lib\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
