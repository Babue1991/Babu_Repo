package StepDefinition;

import cucumber.api.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeSuite;

import PojoClasses.Data;
import PojoClasses.listUserPojo;
import Utility.Login;

public class ListUser extends Login {
		
	String response;
//	String str=" ";
	@BeforeClass
	public static void login() {
		System.out.println("The login methd called");
	}
	  @Given("^The list user input payload$")
	    public void the_list_user_input_payload() throws Throwable {
		  RestAssured.baseURI ="https://reqres.in/";
		
		listUserPojo response = given().log().all().when().get("api/users?page=2").as(listUserPojo.class);
		
		
		List<Data> s =response.getData();
		
		for(int i=0; i< s.size(); i++) {
			if(s.get(i).getEmail().equalsIgnoreCase("tobias.funke@reqres.in")) {
				System.out.println(s.get(i).getLast_name());
			}
		}
		
		String name = response.getData().get(3).getFirst_name();
		System.out.println("Expected name"+name);
		
		System.out.println("The value is" +response.getTotal_pages());
	
		   System.out.println(response.getData().get(0).getEmail());
		   
		   String spURL=response.getSupport().getUrl();
		   System.out.println("The url is" +spURL);
		   
	    }

	    @When("^The user calls  with  GET method$")
	    public void the_user_calls_with_get_method() throws Throwable {
	    	
	    	JsonPath js =new JsonPath(response);
	    	
	    }

	    @Then("^The status message should be success and the response should be 200$")
	    public void the_status_message_should_be_success_and_the_response_should_be_200() throws Throwable {

	    }

}
