package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginCase {


	
	@FindBy(name="q")
	public static WebElement userName;   
	
	@FindBy(className ="gNO89b")
	public static WebElement password;
	
	@FindBy(className="btn btn-default btn-lg btn-block effect ladda-button waves-effect")
	public static WebElement Singin;  
	
	
	/*
	 * public static WebElement username(WebDriver driver) {
	 * 
	 * return driver.findElement(By.id("id")); } public static WebElement
	 * password(WebDriver driver) { return driver.findElement(By.id("id"));
	 * 
	 * }
	 * 
	 * public static WebElement loginButton(WebDriver driver) { return
	 * driver.findElement(By.id("id"));
	 * 
	 * }
	 */
}
