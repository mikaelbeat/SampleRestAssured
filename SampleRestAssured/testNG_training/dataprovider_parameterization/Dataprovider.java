package dataprovider_parameterization;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@Test (dataProvider = "getData")
	public void test(int actual, int expected) {
		int actual_value = actual + 20;
		Assert.assertEquals(actual_value, expected);
	}
	
	@Test (dataProvider = "Test2")
	public void test2(int actual, int expected) {
		int actual_value = actual + 20;
		Assert.assertEquals(actual_value, expected);
	}
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{100, 120},
			{200, 220},
			{300, 310},
			{400, 420},
			{500, 520}
		};
	}
	
	@DataProvider (name = "Test2")
	public Object[][] getData2() {
		return new Object[][] {
			{10, 30},
			{30, 50}
		};
	}

}
