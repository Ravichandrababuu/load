package Qsp;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowser {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Which Browser u want to Cloase");
		String close=sc.nextLine();
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth");
driver.findElement(By.xpath("//span[contains(text(),'Continue with Apple')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Continue with Facebook')]")).click();
Thread.sleep(2000);
String parentAdd = driver.getWindowHandle(); 
System.out.println("Parent Address ="+parentAdd);
Set<String> addresses = driver.getWindowHandles();
   for(String i:addresses) {
	   driver.switchTo().window(i);
	   String title = driver.getTitle();
	      if(title.contains(close)) {
	 driver.findElement(By.xpath("//input[@type='text' and @name='email']")).sendKeys("Ravi Chandra"); 
	 Thread.sleep(2000);
	  driver.close();
	      }
   }

	}

}
