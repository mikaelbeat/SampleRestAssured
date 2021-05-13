package priotise_tests;

import org.testng.annotations.*;


public class priotise {

    
    @Test(priority = 3)
    public void test1() {
    	System.out.println("From Demo test 1");
    }
    
    @Test(priority = 2)
    public void test2() {
    	System.out.println("From Demo test 2");
    }
    
    @Test(priority = 1)
    public void test3() {
    	System.out.println("From Demo test 3");
    }


}