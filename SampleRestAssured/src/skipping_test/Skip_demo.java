package skipping_test;

import org.testng.annotations.*;


public class Skip_demo {

    
    @Test
    public void test1() {
    	System.out.println("From Demo test 1");
    }
    
    @Test (enabled = false)
    public void test2() {
    	System.out.println("From Demo test 2");
    }
    
    @Test
    public void test3() {
    	System.out.println("From Demo test 3");
    }



}