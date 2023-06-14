package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException{
WebDriver driver=new ChromeDriver();
driver.get("http://vtiger-demo.it-solutions4you.com/index.php");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 driver.findElement(By.id("username")).clear();
 Thread.sleep(1000);
 driver.findElement(By.xpath("//input[@id='password' and @type='password']")).clear();
 Thread.sleep(1000);
 driver.quit();

	}	
	
}