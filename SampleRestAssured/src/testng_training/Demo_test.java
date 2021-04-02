package testng_training;

import org.testng.annotations.*;


public class Demo_test {
	
	@BeforeSuite
	public void BeforeSuiteMethod() {
		System.out.println("Runs before test suite.");
	}
	
    @Test
     public void test() {
    	System.out.println("Tests!");
    }
	
	@AfterSuite
	public void AfterSuiteMethod() {
		System.out.println("Runs after suite.");
	}


}


// 4,29