package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncapsulationDriver {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.get("https://demo.actitime.com/login.do");
EncapsulationVeriableDeclareClass e=new EncapsulationVeriableDeclareClass(driver);
e.bussinessLogicMethod("admin","manager");
	}

}
