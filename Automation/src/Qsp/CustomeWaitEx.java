package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomeWaitEx {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String []args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		try {
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("page is loaded");
		        }
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("page is not loaded complete");
		}
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		int i=0;
		while(i<30){
		try {
		driver.findElement(By.cssSelector("a[class='logout']")).click();
                break;
		}
		catch(Exception e) {
                        i++;
		}
		            }
		System.out.println(i);
		driver.close();
	}
}
