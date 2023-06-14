package Qsp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleingDisable {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException,FileNotFoundException,IOException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.bbc.com/");
Thread.sleep(3000);
List<WebElement> newsLink = driver.findElements(By.xpath("//h2[text()='Correspondents']/..//li/a"));
File f=new File("C:\\Users\\ravi\\OneDrive\\Desktop\\news.properties");
PrintWriter p=new PrintWriter(f);

  for(int i=0;i<newsLink.size();i++) {
	  p.println(newsLink.get(i).getAttribute("href"));
  }
  p.close();
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
