package automation_1st_mav_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Write function
//		XSSFWorkbook wb=new XSSFWorkbook();
//		XSSFSheet sheet1=wb.createSheet("Sheet1");
//		Row r0=sheet1.createRow(0);
//		Cell c0=r0.createCell(1);
//		c0.setCellValue("it's KM era");
//		File f = new File("C:\\Users\\HP\\eclipse-workspace\\automation_1st_mav\\src\\test\\resources\\test.xlsx");
//		FileOutputStream fos=new FileOutputStream(f);
//		wb.write(fos);
//		wb.close();
//		fos.close();
//		System.out.println("Written in file");
		//Read from file
		File f= new File("C:\\Users\\HP\\eclipse-workspace\\automation_1st_mav\\src\\test\\resources\\test.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheetAt(0);
//		Row r0= sheet.getRow(0);
//		Cell c0=r0.getCell(0);
//		System.out.println(c0);
		for(Row row:sheet)
		{
			for(Cell cell:row)
			{
				System.out.print(cell+" ");
			}
			System.out.println();
		}
		fis.close();
		
		

	}

}
