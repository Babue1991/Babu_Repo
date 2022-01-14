package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import PageObjects.LoginCase;

public class LoginTC {

	WebDriver driver;
	@Test
	public void logintest() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://dev.smallmoves.org/login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver,LoginCase.class);
	
		LoginCase.UserName.sendKeys("java");
	//	LoginCase.password.click();
		System.out.println("The print statement added");
		//Pulled from 
		//New comment
		//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
		
	/*
	 * Login.username(driver).sendKeys("demo");
	 * Login.password(driver).sendKeys("Password");
	 * Login.loginButton(driver).click();
	 */
		
	}
}
