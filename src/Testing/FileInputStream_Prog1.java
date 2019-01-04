package Testing;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileInputStream_Prog1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		//Create and read the excel file
		FileInputStream fis=new FileInputStream("./data/input.xlsx");
		//create workbook(group of multiple sheets)
		Workbook wb = WorkbookFactory.create(fis);
		//get the sheet
		Sheet sh = wb.getSheet("Sheet1");
		//to get row
		Row r = sh.getRow(0);
		//to get the cell
		Cell c = r.getCell(0);
		//to get the data
		String data=c.toString();
		//String data = c.getStringCellValue();
		System.out.println(data);
		
		

	}

}
