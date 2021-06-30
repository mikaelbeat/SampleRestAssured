package basic_testing;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

//import static io.restassured.RestAssured.given;
//given is for request parameters
//eg. given().param("type", "restaurant")...

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class GetRequestExample {

	static String baseURI = "https://reqres.in/";
	static String path = "/api/users";
	
	
	public static void main(String[] args) {
	

		
		RestAssured.baseURI = baseURI;
		
		when().get(path).then().assertThat().statusCode(200)
		.and().contentType(ContentType.JSON)
		.and().body("data[0].first_name", equalTo("George"));
		
		System.out.println("Request executed successfully!");
		
	}

}
