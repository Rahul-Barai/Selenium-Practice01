package com.btm.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExtractDataFromExcel  {
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	FileInputStream file = new FileInputStream("./data/Test.xlsx");
	System.out.println(WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue());
	
    }
}
