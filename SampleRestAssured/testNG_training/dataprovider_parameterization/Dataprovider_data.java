package dataprovider_parameterization;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class Dataprovider_data {
	
	@DataProvider(name = "TestType")
	public static Object[][] getTestTypeData(ITestContext context) {
		String testName = context.getName();
		if ("integrationLevel".equals(context)) {
			return new Object[][] {{"Integration test data"}};
		}else if ("AcceptanceLevel".equals(testName)) {
			return new Object[][] {{"Acceptance test data"}};
		} else {
			return new Object[][] {{"Common test data"}};
		} 
	}
	
	@DataProvider(name = "scenarioData")
	public static Object[][] getScenarioData(Method context) {
		String testCase = context.getName();
		if ("scenario1".equals(testCase)) {
			return new Object[][] {{"Scenario1 data"}};
		}else if ("scenario2".equals(testCase)) {
			return new Object[][] {{"Scenario2 data"}};
		} else {
			return new Object[][] {{"Common data"}};
		}
	}

}
