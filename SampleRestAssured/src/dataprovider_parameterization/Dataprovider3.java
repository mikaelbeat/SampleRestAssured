package dataprovider_parameterization;

import org.testng.annotations.Test;

public class Dataprovider3 {
	
	@Test(dataProvider = "TestType", dataProviderClass = Dataprovider_data.class)
	public void intergrationTest(String data) {
		System.out.println("Testing data " + data);
	}

}
