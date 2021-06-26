package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotation {
	
	@Test
	@Parameters("browser")
	public void Test_case_one(String browser) {
		System.out.println("Browser passed as .- " + browser);
	}
	
	@Test
	@Parameters({"userName", "password"})
	public void Test_case_two(String userName, String password) {
		System.out.println("Parameter for User Name passed as :- " + userName);
		System.out.println("Parameter for password passed as :- " + password);
	}

}
