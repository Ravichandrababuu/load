package Qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HolidayEx {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
 driver.navigate().to("https://Google.com");
 WebDriverWait wait=new WebDriverWait(driver,10);
 driver.switchTo().activeElement().sendKeys("cleartrip"+Keys.ENTER);
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@id,'wp_thbn')]")));
 driver.findElement(By.linkText("cleartrip.com")).click();
 wait.until(ExpectedConditions.titleContains("Cleartrip: #1 Site for Booking Flights Tickets & Hotels Online"));
 Actions ma=new Actions(driver);
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter mobile number']")));
WebElement pop = driver.findElement(By.xpath("//div[contains(@class,'px-1   flex flex-middl')]"));
ma.click(pop).perform();
driver.findElement(By.xpath("(//div[@class='flex flex-middle'])[2]")).click();
driver.findElement(By.xpath("//span[text()='Round trip']")).click();
driver.findElement(By.xpath("(//div[@class='flex flex-middle'])[3]")).click();
for(int i=0;i<4;i++) {
driver.findElement(By.xpath("(//li[@class='flex-inline'])[1]")).click();
}
driver.findElement(By.xpath("(//div[@class='flex flex-middle'])[3]")).click();
driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("Bangalore");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'BLR')]")));
driver.findElement(By.xpath("//p[contains(text(),'BLR')]")).click();
driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("Goa");
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'GOI')]")));
driver.findElement(By.xpath("//p[contains(text(),'GOI')]")).click();
ma.click(driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']/button[1]"))).perform();
driver.findElement(By.xpath("(//div[text()='2'])[1]")).click();
driver.findElement(By.xpath("(//div[text()='5'])[1]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Search flights')]")).click();
wait.until(ExpectedConditions.titleContains("Cleartrip | Bangalore ⇄ Goa"));
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
List<WebElement> flight = driver.findElements(By.xpath("//p[contains(@class,'fw-400 fs-2 c-neutral')]"));
List<WebElement> departure = driver.findElements(By.xpath("//p[contains(@class,'fw-400 fs-2 c-neutral')]/../../../div[2]/div[1]"));
int count=flight.size();
int count1=departure.size();
System.out.println(count+"    "+count1);
for(int i=0;i<flight.size();i++) {
	String flig=flight.get(i).getText();
	String time=departure.get(i).getText();
	System.out.println("Flight name="+flig+"     "+"Departure time="+time);
}
driver.close();
	}

}
