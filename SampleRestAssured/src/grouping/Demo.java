package grouping;

import org.testng.annotations.*;


public class Demo {

    
    @Test(groups="Regression")
    public void test1() {
    	System.out.println("From Demo test 1");
    }
    
    @Test(groups="Smoke")
    public void test2() {
    	System.out.println("From Demo test 2");
    }
    
    @Test(groups="Regression")
    public void test3() {
    	System.out.println("From Demo test 3");
    }
    
    @Test(groups={"Smoke", "Sanity"})
    public void test4() {
    	System.out.println("From Demo test 4");
    }
    
    @Test(groups="Sanity")
    public void test5() {
    	System.out.println("From Demo test 4");
    }


}