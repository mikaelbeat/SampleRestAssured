package dataprovider_parameterization;

import org.testng.annotations.Test;

public class Dataprovider4 {
	
	@Test(dataProvider = "TestType", dataProviderClass = Dataprovider_data.class)
	public void acceptanceTest(String data) {
		System.out.println("Testing data " + data);
	}

}
