package Qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleTab {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException,AWTException {
		ChromeOptions c=new ChromeOptions();
		ChromeOptions notificationblocksettings = c.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver();
driver.get("https://Google.com");
driver.switchTo().activeElement().sendKeys("Online.qspiders.com/student"+Keys.ENTER);
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
int i=0; 
do {
try {
           driver.findElement(By.partialLinkText("Online Student | Qspiders")).click();
break;
                 }
catch(Exception e) {
	        i++;
                 }
                        }while(i<50);
  //System.out.println(i);
Actions ma=new Actions(driver);
WebDriverWait wait=new WebDriverWait(driver,10);
wait.until(ExpectedConditions.titleContains("Online Student | Qspiders"));
driver.findElement(By.xpath("//input[@type='email' and @placeholder='Enter Email here' ]")).sendKeys("ravichandrababu521@gmail.com");
WebElement phonecode = driver.findElement(By.xpath("//div[@class='vs__selected-options']"));
ma.click(phonecode).perform();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
driver.findElement(By.cssSelector("input[placeholder='Enter number here']")).sendKeys("8790844365");
WebElement loginbutton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
ma.click(loginbutton).perform();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'ravichandrababu521')]")));
driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("Ravich@123");
driver.findElement(By.xpath("//button[@type='submit']")).submit();
wait.until(ExpectedConditions.titleContains("My Course | Student"));
    String title = driver.getTitle();
        if(title.contains("My Course | Student"))
        	System.out.println("page is loaded sucessfully");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'WPPE7')]/../../footer/a")));
        driver.findElement(By.xpath("//h2[contains(text(),'WPPE7')]/../../footer/a")).click();
        
	}

}
