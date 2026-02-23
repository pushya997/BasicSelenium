package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		By search = By.className("Pke_EE");
		WebElement ele = driver.findElement(search);
		ele.sendKeys("Mobiles");
		Thread.sleep(2000);
		By btn = By.className("_2iLD__");
		WebElement ele1 = driver.findElement(btn);
		ele1.click();
		//driver.close();
	}

}
