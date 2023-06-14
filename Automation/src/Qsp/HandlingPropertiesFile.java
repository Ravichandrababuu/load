package Qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingPropertiesFile {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args)throws FileNotFoundException,IOException,InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth");
driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
Set<String> address = driver.getWindowHandles();
       for(String i:address) {
    	   System.out.println(i);
    	   driver.switchTo().window(i);
    	   System.out.println(driver.getTitle());
    	   Thread.sleep(2000);
    	     driver.close();
       }
	}

}
