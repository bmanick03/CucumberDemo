package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class nhsInputExcel{

	public static String readData(String sheetName, int rowNo, int cellNo) throws IOException {
		
		
		File f = new File("C:\\Users\\BERLIN BABILA\\eclipse-workspace\\NhsAssessment\\nhsInputFile.xlsx");
		
		FileInputStream finput = new FileInputStream(f);
		
		Workbook book = new XSSFWorkbook(finput);
		
		Sheet st = book.getSheet("Preferences");
		
		Row r = st.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		String input = c.getStringCellValue();
		
		if(c.getCellType()==1) {
			
			return input;
		}
		
		else {
			double d = c.getNumericCellValue();
			long l = (long)d;
			input = String.valueOf(l);	
			return input;
		}
	}
	
}
