package com.actitime.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EncapsulationVeriableDeclareClass {

	private WebElement untbx;
	private WebElement pstbx;
	private WebElement lgbtn;//declaration done
	//constructor is the best place to intialize the veriable ...!
	public EncapsulationVeriableDeclareClass(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		untbx=driver.findElement(By.id("username"));
		pstbx=driver.findElement(By.name("pwd"));
		lgbtn=driver.findElement(By.xpath("//div[text()='Login ']"));//intialization is done
	}
public void bussinessLogicMethod(String un,String ps) {
	untbx.sendKeys(un);
	pstbx.sendKeys(ps);
	lgbtn.click();
	}
	
}
