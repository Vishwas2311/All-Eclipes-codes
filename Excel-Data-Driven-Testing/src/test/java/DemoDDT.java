import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoDDT {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	//Common points to perform
	// 1) scan all the column and get the correct column
	// 2) get the correct column
	// 3) Retrieve the all data from the 
	
	FileInputStream FIS=new FileInputStream("V:\\Self study\\Data Driven Testing with Excel\\Book1.xlsx");
	
            Workbook WorkBook=WorkbookFactory.create(FIS);
	
	//scanning no of sheets with name
	int sheets=WorkBook.getNumberOfSheets();

	for(int i=0; i<sheets;i++) {
		
		//sheetname assertion
		if (WorkBook.getSheetName(i).equalsIgnoreCase("TestData1")) {
			//sheet name	
			XSSFSheet sheet=(XSSFSheet) WorkBook.getSheetAt(i);
					 
			//row iteration
			Iterator<Row> rows=sheet.iterator(); 
			
			//moving the 1st row
			Row Firstrow=rows.next();
			
			//cell of rows
		 Iterator<Cell> cells=Firstrow.cellIterator();
		 
		 int K = 0;
		 int count = 0;
			while (cells.hasNext()) { //just checking the is there any row
				Cell cell=cells.next();//moving to the next cell of the first row
				
				
				if (cell.getStringCellValue().equalsIgnoreCase("TestCase")) {
					count=K;
				}
				K++;
			}
			System.out.println(count);
		}
	
	}
	
	
	
	
	
	
	
	
}
}
