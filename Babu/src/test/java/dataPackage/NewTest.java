package dataPackage;

import org.testng.annotations.Test;

public class NewTest {

	String [][] params = {
		 
		{"Correct", "Invalid"},
		{"Invalid", "Correct"},
		{"Invalid", "Invalid"},
		{"Correct", "Correct"}
	};
	
	String[][] data= {
		
			{"Babu", "Eaga"},
			{"kannan", "navin"}
	};
	
	@org.testng.annotations.DataProvider(name="username")
	public String[][]  send() {
		return data;
	}
	
	
	
	
	@Test(dataProvider = "username")
	public void test1(String fname, String lname) {
		System.out.println("The names are: "+fname + " "+lname);
	}
	
	String[][] iOS = {
			{"Rakesh", "Vivek"},
			{"bbb", "nnn"},
	};
	
	@org.testng.annotations.DataProvider(name="iosTeam")
	public String[][] pack(){
		return iOS;
		
	}
	
	
	@Test(dataProvider = "iosTeam")
	public void test12(String fname, String lname) {
		System.out.println("The names are: "+fname + " "+lname);
	}
	
	
	
	
	
	@org.testng.annotations.DataProvider(name ="Authentication")
	public String[][] DataProvider() {
		return params;
	}


	@Test(dataProvider = "Authentication")
	public void f(String uName, String pwd) {
		System.out.println("The values are: " +uName + " "+pwd);

	}
}
