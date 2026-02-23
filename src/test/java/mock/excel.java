package mock;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "./src/test/resources/excel.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		Sheet s = book.getSheet("Sheet2");
		Row r = s.getRow(0);
		Row r1 = s.getRow(1);
		Cell c = r.getCell(0);
		Cell c1 = r.getCell(1);
		Cell k = r1.getCell(0);
		Cell k1 = r1.getCell(1);
		if (c == null || c1 == null || k == null || k1 == null) {
			System.out.println("invalid 2*2 matrix");
		} else {
			String data = c.getStringCellValue();
			String data1 = c1.getStringCellValue();
			String data2 = k.getStringCellValue();
			String data3 = k1.getStringCellValue();
			if (data == null || data1 == null || data2 == null || data3 == null) {
				System.out.println("invalid 2*2 matrix");
			} else {
				System.out.println("valid 2*2 matrix");
				System.out.println(data);
				System.out.println(data1);
				System.out.println(data2);
				System.out.println(data3);
			}
		}

	}

}
