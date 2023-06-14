package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;

public class AssertionEx extends BaseClass{
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
static WebDriver driver;
@Test
public void assertionEx()  {
driver=new ChromeDriver();
driver.get("https://www.google.com/");
String etitle="Google";
String atitle=driver.getTitle();
SoftAssert sf=new SoftAssert();
sf.assertEquals(atitle,etitle);
driver.close();
sf.assertAll();
System.out.println("hello");
       }

}
