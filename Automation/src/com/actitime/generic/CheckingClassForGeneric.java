package com.actitime.generic;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckingClassForGeneric {

	public static void main(String[] args) throws FileNotFoundException,IOException {
GenericLibraryEx l1=new GenericLibraryEx();
 String key=l1.getPropertyFile("url");
 System.out.println(key);

 String testdata=l1.getExcelFile("sheet1",1,3);
 System.out.println(testdata);
 
 l1.writeExcelFile("sheet1",1,5,"Skipped");//after doing this u have to get that data it is save or not.
  testdata=l1.getExcelFile("sheet1",1,5);
 System.out.println(testdata);
 
 
 
	}

}
