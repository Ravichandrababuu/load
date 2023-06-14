package Qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleingMouseActionsEx  {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException,AWTException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.vtiger.com/");
driver.manage().window().maximize();
Actions ma=new Actions(driver);
ma.moveToElement(driver.findElement(By.partialLinkText("Resources"))).perform();
ma.click(driver.findElement(By.partialLinkText("Customers"))).perform();
int i=0;
 while(i<50) {
try {
ma.doubleClick(driver.findElement(By.id("loginspan"))).perform();
         break;
            }
catch(Exception e) {
	   i++;
}
                    }
 System.out.println(i);
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 driver.findElement(By.xpath("//title[contains(text(),'Login - Vtiger')]"));
  String title = driver.getTitle();
   if(title.contains("Login - Vtiger"))
	   System.out.println("page is loaded");
   else
	   System.out.println("not");
   driver.close();
	}

}
