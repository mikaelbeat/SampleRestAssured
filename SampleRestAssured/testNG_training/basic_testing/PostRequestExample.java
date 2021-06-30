package basic_testing;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostRequestExample {
	
	static String baseURI = "https://reqres.in/";
	static String path = "/api/users";
	
	
	public static void main(String[] args) {
	
		PostRequest();	
	}


	@Test
	public static void PostRequest() {
		RestAssured.baseURI = baseURI;
		
		String payload = "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
		
		given().body(payload).
		
		when().post(path).then().assertThat().statusCode(201)
		.and().contentType(ContentType.JSON).and().body("name", equalTo("Matti"));
		
		System.out.println("Request executed successfully!");
		
	}

}