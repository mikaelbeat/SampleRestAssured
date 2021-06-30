package basic_testing;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ResponseValidation {
	
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
		
		Response res =
		given().body(payload).
		
		when().post(path).then().assertThat().statusCode(201)
		.and().contentType(ContentType.JSON).
		
		extract().response();
		
		String response = res.asString();
		
		JsonPath jsonResponse = new JsonPath(response);
		String valueFromJson = jsonResponse.get("id");
		
		System.out.println("Request executed successfully!");
		System.out.println("Whole response as string -> " + response);
		System.out.println("Id value taken from Json response -> " + valueFromJson);
		
	}

}