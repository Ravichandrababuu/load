package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Demo {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","./driver/edgedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.typingtest.com/");
		driver.navigate().to("file:///C:/Users/ravi/OneDrive/Desktop/demo.html");
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.className("c1")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("google")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("goog")).click();
		driver.navigate().back();
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("oogle")).click();
		driver.navigate().back();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='https://www.qspiders.com']")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("oogl")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='https://www.jspiders.com']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		driver.close();
	
    }
}
