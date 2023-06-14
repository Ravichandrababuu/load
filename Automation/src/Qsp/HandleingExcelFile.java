package Qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleingExcelFile {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException,IOException, InterruptedException {
FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
Workbook wb = WorkbookFactory.create(fis);
  int lastr = wb.getSheet("sheet1").getLastRowNum();
   for(int i=1;i<=lastr;i++) {
wb.getSheet("sheet1").getRow(i).getCell(5).setCellValue("pass");
   }
FileOutputStream fos=new FileOutputStream("./data/Book1.xlsx");
wb.write(fos);
wb.close();
	}

}
