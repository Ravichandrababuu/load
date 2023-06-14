package com.actitime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotEx {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args)throws IOException {
WebDriver driver=new ChromeDriver();
 driver.get("https://www.bbc.com/");
  driver.manage().window().maximize();
 int y=driver.findElement(By.xpath("//span[contains(@class,'module__title__link tag tag--defau')]")).getLocation().getY();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,"+y+")");
	TakesScreenshot ts=(TakesScreenshot)driver;
   File src = ts.getScreenshotAs(OutputType.FILE);//indirectly we are pressing the prtscreen button.
   //Why output file formate only means java will understand only file .store that pic we need one folder & filename
   File des=new File("./ScreenShot/ss.png");
        FileUtils.copyFile(src,des);
        driver.close();
	}

}
