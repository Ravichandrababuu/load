package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectAutoSugg {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
try {
driver.get("https://www.facebook.com/");
System.out.println("page is loading with in 3 sec");
}
catch(Exception e) {

	e.printStackTrace();
	System.out.println("page is not load in 3 secs");
}
driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 s')]")).click();
String atribute = driver.findElement(By.name("lastname")).getAttribute("id");
String style=driver.findElement(By.name("lastname")).getCssValue("font-size");
String tagname = driver.findElement(By.xpath("//button[@name='websubmit' and @type='submit']")).getTagName();
String text = driver.findElement(By.xpath("//label[text()='Male']")).getText();
System.out.println(style);
System.out.println(text);
System.out.println(tagname);
System.out.println(atribute);
driver.close();

	}
}
