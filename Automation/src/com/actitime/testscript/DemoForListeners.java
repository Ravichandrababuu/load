package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenersEx.class)
public class DemoForListeners extends BaseClass{
@Test
public void demo() {
	Reporter.log("implementing Listeners");
	Assert.fail();
   }
	
}
