package Qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class PopupEx {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException,AWTException {
		ChromeOptions co=new ChromeOptions();
		ChromeOptions settings = co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(settings);
driver.get("http://www.dhtmlgoodies.com/");
Actions ma=new Actions(driver);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
ma.click(driver.findElement(By.partialLinkText("Drag and drop"))).perform();
List<WebElement> likns = driver.findElements(By.xpath("//h2[contains(text(),'iGoogle-like Drag & Drop')]/../p/a"));
 for(WebElement i:likns) {
	 String text=i.getText();
	    if(text.equals("Our local demo")) {
	    	i.click();
	    }
 }
 Set<String> address = driver.getWindowHandles();
 List<String> li=new ArrayList<String>(address);
 driver.switchTo().window(li.get(1));
 WebElement source=driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
 WebElement destination=driver.findElement(By.xpath("//h1[contains(text(),'Block 4')]"));
 ma.dragAndDrop(source,destination).perform();
 Thread.sleep(5000);
 driver.close();
 driver.switchTo().window(li.get(0));
 driver.close();

	}

}
