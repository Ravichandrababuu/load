package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.seleniumhq.jetty9.util.Scanner;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

//@Parameters(name="browser" value="")
public class BaseClass {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
}
	public  WebDriver driver;
	@Parameters("browser")
	@BeforeClass(groups = {"smokeTesting","regressionTesting"})
	public void openBrowser(String browser) {
      if(browser.contains("chrome")) {
    	  driver=new ChromeDriver();
      }
      else if(browser.contains("edge")) {
    	  driver=new EdgeDriver();
      }
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("openBrowser",true);
	}
	@AfterClass(groups = {"smokeTesting","regressionTesting"})
	public void cloaseBrowser() {
	driver.close();
		Reporter.log("closeBrowser",true);
	}
	@BeforeMethod(groups = {"smokeTesting","regressionTesting"})
	public void login() throws FileNotFoundException,IOException {
		GenericLibraryEx gb=new GenericLibraryEx();
		String url=gb.getExcelFile("Sheet1",1, 2);
driver.get(url);
String user=gb.getExcelFile("Sheet1", 1,3);
		driver.switchTo().activeElement().sendKeys(user);
		String pass=gb.getExcelFile("Sheet1", 1, 4);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Reporter.log("Login",true);
	}
	@AfterMethod(groups = {"smokeTesting","regressionTesting"})
	public void logout() {
		driver.findElement(By.partialLinkText("Logout")).click();
		Reporter.log("Logout",true);
	}
}
