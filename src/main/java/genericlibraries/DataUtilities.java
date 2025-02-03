package genericlibraries;


import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class DataUtilities
{
	public String readingDataPropertyFile(String data) throws Exception
	{
		Properties properties=new Properties();
		properties.load(new FileInputStream(AutoConstant.propertyFilePath));
		return properties.getProperty(data);
		
	}
	
	public String readingDataExcelFile(String data,int rowNumber,int cellNumber) throws Exception
	{
		FileInputStream fis=new FileInputStream(AutoConstant.excelFilePath);
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(data).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	}

}
