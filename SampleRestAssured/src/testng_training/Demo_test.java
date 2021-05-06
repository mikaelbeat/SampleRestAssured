package testng_training;

import org.testng.annotations.*;


public class Demo_test {
	
	@BeforeSuite
	public void BeforeSuiteMethod() {
		System.out.println("Runs before test suite.");
	}
	
    @Test
     public void test() {
    	System.out.println("From Demo test 1 - 1");
    }
    
    @Test
    public void test2() {
    	System.out.println("From Demo test 1 - 2");
    }
	
	@AfterSuite
	public void AfterSuiteMethod() {
		System.out.println("Runs after suite.");
	}


}