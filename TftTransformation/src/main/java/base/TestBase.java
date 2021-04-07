package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;
	public Properties prop;
	
	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\sbaru\\eclipse-workspace\\TftTransformation"
				+ "\\src\\main\\java\\property\\config.properties");
		prop.load(fis);
	}
	
	public void initialization ( ) {
		
		System.setProperty("webDriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	}

}
