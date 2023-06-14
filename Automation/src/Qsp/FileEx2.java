package Qsp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileEx2 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args)throws FileNotFoundException,IOException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.switchTo().activeElement().sendKeys("flipcart.com"+Keys.ENTER);
RemoteWebDriver rwb=(RemoteWebDriver)driver;
rwb.executeScript("window.scrollBy(document.body.scrollWidth,0)");
int i=0;
while(i<50) {
try {
driver.findElement(By.xpath("(//h3[contains(text(),'Online Shopping Site for Mo')])[1]")).click();
       break;
             }
catch(Exception e) {
	i++;
}
}
WebDriverWait wait=new WebDriverWait(driver,10);
wait.until(ExpectedConditions.titleContains("Online Shopping Site for Mobiles, Electronics"));
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.name("q")).sendKeys("iphone 14pro max"+Keys.ENTER);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[alt='Buying Guide']")));
List<WebElement> mobile = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]"));
List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]"));
 List<String>both=new ArrayList<String>();
    for(int j=0;j<price.size();j++) {
    	both.add(mobile.get(j).getText()+"   "+price.get(j).getText());	 
    }
    File f=new File("C:\\Users\\ravi\\OneDrive\\Desktop\\iphone.docx");
    PrintWriter pw=new PrintWriter(f);
    System.out.println("Storing the data  into docx");
       for(int j=0;j<both.size();j++){
pw.println(both.get(i));
       }
       pw.close();
       System.out.println("we are reading the file using bufferedReader");
       FileReader fr=new FileReader(f);
       BufferedReader bf=new BufferedReader(fr);
       String s=bf.readLine();
       while(s!=null) {
    	   System.out.println(s);
   s=bf.readLine();
       }
    driver.close();
	}

}
