package TestCases;

import PageObjects.HomeScreen;

public class HomeTc {

	public void homeScreen() {
		String text = HomeScreen.PrincpalName.getText();
		System.out.println("The home screen text is :" +text);
		
	}
}
