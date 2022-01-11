package StepDefinition;

import static io.restassured.RestAssured.given;

import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class postFile {

	public static void main(String[] args) {

		RestAssured.baseURI ="https://reqres.in/";

		int res =  given().log().all()
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}")
				.when().post("api/users").then().log().all().assertThat().statusCode(200).extract().statusCode();

		if(res == 201) {

			int statCode =given().given().log().all()
					.when().get("api/users?page=2")
					.then().log().all().assertThat().statusCode(200).extract().statusCode();
			System.out.println("The GET API response is" +statCode);

		}else {
			System.out.println("fail");
		}


	}

}
