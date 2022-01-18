package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Browserlaunch {

	public static WebDriver driver;
	@BeforeClass
	public static void initWeb() {
		System.out.println("Inside browser launch");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://dev.smallmoves.org/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public static void driverClose() {
		System.out.println("close browser");
	//	driver.close();
	}
}
