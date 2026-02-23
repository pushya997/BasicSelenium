package mock;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbdataProvider {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("./src/test/resources/fb_dataprovider");
		Properties p = new Properties();
		p.load(file);
		String mail = p.getProperty("email");
		String pwd = p.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}


	}


