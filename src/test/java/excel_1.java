import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class excel_1 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//fetch data from excel
		Workbook book = WorkbookFactory.create(new FileInputStream("./src/test/resources/excel.xlsx"));
		Row tgt_row = book.getSheet("Sheet1").getRow(0);
		String un = tgt_row.getCell(0).toString();
		String pwd = tgt_row.getCell(1).toString();
		//enter username
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		}
}
