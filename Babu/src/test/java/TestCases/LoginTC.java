package TestCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import PageObjects.LoginCase;
import Utility.Browserlaunch;
import net.bytebuddy.implementation.bind.annotation.Super;

public class LoginTC extends Browserlaunch{

	WebDriver driver = Browserlaunch.driver;
	
	@Test
	public void logintest() {
		System.out.println("inside login test");
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		 * driver = new FirefoxDriver(); driver.get("https://dev.smallmoves.org/login");
		 */	
		
	//	PageFactory.initElements(driver,LoginCase.class);
		PageFactory.initElements(driver, Browserlaunch.class);

	//	LoginCase.uName(driver).sendKeys("babu@fsp.com");
	
		LoginCase.UserName.sendKeys("babufsp1@gmail.com");
		LoginCase.password.sendKeys("password");
		
		LoginCase.Login_button.click();
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
