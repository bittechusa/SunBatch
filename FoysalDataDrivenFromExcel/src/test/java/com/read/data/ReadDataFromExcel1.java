package com.read.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;

public class ReadDataFromExcel1 extends BaseClass
{
 @Test			  
 public void readData() {   
		  
		 try {  
		     
		  FileInputStream file = new FileInputStream(new File("C:\\t.xls"));   
		  HSSFWorkbook workbook = new HSSFWorkbook(file);  
		  
		  HSSFSheet sheet = workbook.getSheetAt(0);  
		    
		  String heading = sheet.getRow(0).getCell(0).getStringCellValue();  
		     
		  String searchText1 = sheet.getRow(1).getCell(0).getStringCellValue();  
		     
		  String searchText2 = sheet.getRow(2).getCell(0).getStringCellValue();
		  String searchText3 = sheet.getRow(1).getCell(1).getStringCellValue();
		  for(int c=0;c<=1;c++){
			  for(int r=0;r<=3;r++)
			  {
			  driver.findElement(By.id("u_0_1")).sendKeys(sheet.getRow(r).getCell(c).getStringCellValue());
			 // driver.findElement(By.id("u_0_3")).sendKeys(sheet.getRow(r).getCell(c).getStringCellValue());
			  driver.findElement(By.id("u_0_1")).clear();
			  }
			  
		  }
		  
		 
		     
		  System.out.println("Heading is:" + heading);  
		     
		  System.out.println("Search Text 1 is:" + searchText1);  
		     
		  System.out.println("Search Text 2 is:" + searchText2);  
		  
		  file.close();  
		  
		 } catch (FileNotFoundException fnfe) {  
		  fnfe.printStackTrace();  
		 } catch (IOException ioe) {  
		  ioe.printStackTrace();  
		 }  
		 }  
		} 


