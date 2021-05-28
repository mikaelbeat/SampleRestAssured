package dependancy;

import org.testng.annotations.*;


public class Dependancy {

    
    @Test
    public void test1() {
    	System.out.println("From Demo test 1");
    }
    
    @Test(dependsOnMethods = "test1")
    public void test2() {
    	System.out.println("From Demo test 2");
    }
    
    @Test(dependsOnMethods = "test2")
    public void test3() {
    	System.out.println("From Demo test 3");
    }
    
    @Test
    public void test4() {
    	System.out.println("From Demo test 4");
    }
    
    @Test(dependsOnMethods = {"test1", "test3"})
    public void test5() {
    	System.out.println("From Demo test 4");
    }


}