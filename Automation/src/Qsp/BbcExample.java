package Qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcExample{

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException,InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.selenium.dev/downloads/");
Robot r=new Robot();
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_P);
Thread.sleep(2000);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(2000);
for(int i=0;i<6;i++) {
	 r.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(1000);
}
r.keyRelease(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_ALT);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
r.keyRelease(KeyEvent.VK_ALT);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_1);
r.keyPress(KeyEvent.VK_MINUS);
r.keyPress(KeyEvent.VK_2);
Thread.sleep(1000);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_LEFT);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(1000);
driver.close();
	}

}
