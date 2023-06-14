package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a Generic class Which is created to make Code Optimise & reduce the code get the files more faster.
 * @author Ravi
 *
 */
public class GenericLibraryEx {
/**
 * This method is created to read the data from the Property file.
 * @param key
 * @return
 * @throws FileNotFoundException
 * @throws IOException
 */
	public String getPropertyFile(String key) throws FileNotFoundException,IOException
	{
		FileInputStream fis=new FileInputStream("./data/commontestdata.property");
		Properties p=new Properties();
		p.load(fis);
		String ke= p.getProperty(key);
		return ke;
	}
	/**
	 * This method is created to read the data from the Excel from any class.
	 * @param sheetname
	 * @param row
	 * @param cellnumber
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String getExcelFile(String sheetname,int row,int cellnumber) throws FileNotFoundException,IOException
	{
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String testdata=wb.getSheet(sheetname).getRow(row).getCell(cellnumber).getStringCellValue();
		return testdata;
	}
	/**
	 * This method is created to Write the data to Excel file.
	 * @param sheetname
	 * @param row
	 * @param cellnumber
	 * @param value
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void writeExcelFile(String sheetname,int row,int cellnumber,String value) throws FileNotFoundException,IOException
	{
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cellnumber).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./data/Book1.xlsx");
		wb.write(fos);//actual writing done after saving the file so they name this method as write
		wb.close();//we have to close the file after writing it is mandatory will we are passing the data.
	}
	

}
