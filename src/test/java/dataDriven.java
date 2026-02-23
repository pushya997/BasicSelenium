import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataDriven {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("./src/test/resources/data.properties");
		//open property file
		Properties p = new Properties();
		p.load(file);
		//fetch/read the data
		String str = p.getProperty("email");
		String str1 = p.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//utilize the data
		driver.findElement(By.id("email")).sendKeys(str);
		driver.findElement(By.id("pass")).sendKeys("str1");
		
		

	}

}
