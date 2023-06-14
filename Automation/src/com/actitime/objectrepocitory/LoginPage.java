package com.actitime.objectrepocitory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebElement untbx;
	private WebElement pstbx;
	private WebElement lgbtn;//declaration done

	public LoginPage(WebDriver driver) {//constrauctor is the best place to instalize
		untbx=driver.findElement(By.id("username"));
		pstbx=driver.findElement(By.name("pwd"));
		lgbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	public void setLogin(String un,String pw) {//utilization
		untbx.sendKeys(un);
		pstbx.sendKeys(pw);
		lgbtn.click();
	           }
	}
