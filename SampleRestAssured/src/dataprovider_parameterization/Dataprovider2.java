package dataprovider_parameterization;

import org.testng.annotations.Test;

public class Dataprovider2 {
	
	@Test(dataProvider = "scenarioData", dataProviderClass = Dataprovider_data.class)
	public void Scenario1(String scenarioData) {
		System.out.println("Testing scenario " + scenarioData);
	}
	
	@Test(dataProvider = "scenarioData", dataProviderClass = Dataprovider_data.class)
	public void Scenario2(String scenarioData) {
		System.out.println("Testing scenario " + scenarioData);
	}
	
	@Test(dataProvider = "scenarioData", dataProviderClass = Dataprovider_data.class)
	public void Scenario3(String scenarioData) {
		System.out.println("Testing scenario " + scenarioData);
	}

}
