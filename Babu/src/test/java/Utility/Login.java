package Utility;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Login {

	@BeforeSuite
	public static void login() {
		System.out.println("The login methd called");
	}
}
