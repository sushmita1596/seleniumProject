package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {
	public static HashMap<String, String> readExcel() throws IOException {
		
		HashMap<String, String> data = new HashMap<String, String>();

		// Create an object of File class to open xlsx file

		File file = new File("C:\\Users\\sushmita\\Documents\\TestData1.xlsx");

		// Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(file);

		Workbook guru99Workbook = null;

		// Find the file extension by splitting file name in substring and getting only
		// extension name

		// If it is xlsx file then create object of XSSFWorkbook class

		guru99Workbook = new XSSFWorkbook(inputStream);

		// Check condition if the file is xls file

		// Read sheet inside the workbook by its name

		Sheet guru99Sheet = guru99Workbook.getSheet("Sheet1");

		// Find number of rows in excel file

		int rowCount = guru99Sheet.getLastRowNum() - guru99Sheet.getFirstRowNum();

		// Create a loop over all the rows of excel file to read it

		for (int i = 0; i < rowCount + 1; i++) {

			Row row = guru99Sheet.getRow(i);

			// Create a loop to print cell values in a row

			for (int j = 0; j < row.getLastCellNum() - 1; j++) {

				// Print Excel data in console
				data.put(row.getCell(j).getStringCellValue(), row.getCell(j + 1).getStringCellValue());
				System.out.println(data.get(row.getCell(j).getStringCellValue()));

				// System.out.print(row.getCell(j).getStringCellValue()+"|| ");

			}

		}
		return data;

	}

}
