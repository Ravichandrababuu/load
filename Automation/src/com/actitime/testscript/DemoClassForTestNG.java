package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoClassForTestNG {
    @Test
    public void demo() {
    	Reporter.log("hello TestNG",true);
    }
    @Test
    public void ammer() {
    	Reporter.log("He is my best frd But he changed",true);
    }
    @Test
    public void ravi() {
    	Reporter.log("he is a bad person",false);
    }
}
