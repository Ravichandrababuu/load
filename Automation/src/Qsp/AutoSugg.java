package Qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSugg {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
try {
driver.get("https://demo.actitime.com/login.do");
System.out.println("pageLoadTimeout method is within 5 sec");
}
catch(Exception e) {
	e.printStackTrace();
	System.out.println("pageLoadTimeout method is not loaded within 5 sec");
}
WebDriverWait wait=new WebDriverWait(driver, 20);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
boolean selected = driver.findElement(By.xpath("//input[contains(@id,'keepLogg')]")).isSelected();
System.out.println("the checkbox is selected or not="+selected);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
try {
Thread.sleep(5000);
}
catch(InterruptedException e) {
	e.printStackTrace();
}
driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Types of ')]"))).click();
String title=driver.getTitle();
System.out.println(title);
  List<WebElement> tableData = driver.findElements(By.xpath("//td"));
  int count=tableData.size();
  System.out.println(count);
  System.out.println("printing the data of table by using forEachLOOP");
     for(WebElement i:tableData)
     {
    	 System.out.println(i.getText());
     }
driver.close();
	}

}
