package JavaScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scnshot {

	public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/google.png");
	FileHandler.copy(src, dest);
	

	}

}
