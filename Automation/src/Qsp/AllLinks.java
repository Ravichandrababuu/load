package Qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.youtube.com/");
	  //if we want to join the two xpath then we go for (|) Symbol.
   List<WebElement> allLinks = driver.findElements(By.xpath("(//a)[1]|(//a)[last()]"));
   int count=allLinks.size();
   System.out.println(count);
       System.out.println("printing the AllLinks present in Youtube By using forEach loop");
          for(WebElement i: allLinks)
          {
        	  System.out.println(i.getText());
          }
    driver.close();
	       }
	}
	