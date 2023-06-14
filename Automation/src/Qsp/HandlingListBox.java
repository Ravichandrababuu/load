package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingListBox {

	static {
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new EdgeDriver();
driver.get("https://Google.com");
driver.findElement(By.name("q")).sendKeys("flipkart page");
WebDriverWait wait=new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
driver.findElement(By.xpath("(//input[contains(@value,'Google Search')])[1]")).click();
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'flipkart.com')]")));
driver.findElement(By.xpath("//span[contains(text(),'flipkart.com')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB')]")).click();
driver.findElement(By.xpath("//input[contains(@title,'Search for ')]")).sendKeys("iphone 14 pro max");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
wait.until(ExpectedConditions.titleContains("Iphone 14 Pro Max- Buy Products Online"));
String title=driver.getTitle();
System.out.println(title);
Thread.sleep(3000);
List<WebElement> nameele = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]"));
List<WebElement> priceele = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]"));
int count=nameele.size();    
for(int i=0;i<nameele.size();i++) {
	System.out.println("Product name="+nameele.get(i).getText()+"    "+"Product price="+priceele.get(i).getText());
	Thread.sleep(1000);
}

		driver.close();
	}
}
