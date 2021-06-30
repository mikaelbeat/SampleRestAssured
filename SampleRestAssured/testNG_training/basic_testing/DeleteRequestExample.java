package basic_testing;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeleteRequestExample {
	
	static String baseURI = "https://reqres.in/";
	static String path = "/api/users/2";
	
	
	public static void main(String[] args) {
	
		DeleteRequest();	
	}


	@Test
	public static void DeleteRequest() {
		RestAssured.baseURI = baseURI;

		
		given().
		
		when().delete(path).then().assertThat().statusCode(204);
		
		System.out.println("Request executed successfully!");
		
	}

}