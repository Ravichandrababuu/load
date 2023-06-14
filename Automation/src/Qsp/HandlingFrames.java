package Qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException,AWTException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/ravi/OneDrive/Desktop/page1.html");
driver.switchTo().frame("f1");
   driver.findElement(By.id("t2")).sendKeys("A");
   Thread.sleep(1000);
   driver.switchTo().defaultContent();
   driver.findElement(By.id("t1")).sendKeys("B");
   Thread.sleep(1000);
driver.switchTo().frame("f1");
    driver.findElement(By.id("t2")).sendKeys("c");
    Thread.sleep(1000);
    driver.switchTo().defaultContent();
    driver.findElement(By.id("t1")).sendKeys("d");
  driver.switchTo().frame(0);
  Actions ma=new Actions(driver);
  ma.contextClick(driver.findElement(By.id("t2"))).perform();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_E);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
   Thread.sleep(3000);
    driver.close();
   
	}

}
