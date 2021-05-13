package assertion;

import org.testng.Assert;
import org.testng.annotations.*;


public class assertion {

    
    @Test
    public void test1() {
    	System.out.println("Test 1");
    	Assert.assertEquals("Hello", "Hello");
    }
    
    @Test
    public void test2() {
    	System.out.println("Test 2");
    	Assert.assertTrue(true);
    }
    
    @Test
    public void test3() {
    	System.out.println("Test 3");
    	Assert.assertTrue(false, "*** This was expected to fail ***");
    }


}