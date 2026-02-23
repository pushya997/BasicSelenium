package JavaScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sauce_scnshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/ ");
		WebElement tgt = driver.findElement(By.xpath("//input[@id='login-button']"));
		File src = tgt.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/login.png");
		FileHandler.copy(src, dest);
	}

}
