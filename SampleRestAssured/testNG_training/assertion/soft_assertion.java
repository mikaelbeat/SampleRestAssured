package assertion;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class soft_assertion {

    
    @Test
    public void test1() {
    	SoftAssert softAssert = new SoftAssert();
    	System.out.println("Test 1");
    	softAssert.assertEquals("Hello", "Hillo");
    	System.out.println("Test 1 done");
    	softAssert.assertAll();
    }
    
    @Test
    public void test2() {
    	SoftAssert softAssert = new SoftAssert();
    	System.out.println("Test 2");
    	softAssert.assertTrue(false);
    	System.out.println("Test 2 done");
    	softAssert.assertAll();
    }
    
    @Test
    public void test3() {
    	SoftAssert softAssert = new SoftAssert();
    	System.out.println("Test 3");
    	softAssert.assertTrue(false, "*** This was expected to fail ***");
    	System.out.println("Test 3 done");
    	softAssert.assertAll();
    }


}