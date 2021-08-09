package Ibtikar.testJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase{
	
	protected WebDriver driver;
	
	public void openMyBrowser(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			
		driver.get(url);
		driver.manage().window().maximize();
	}
}