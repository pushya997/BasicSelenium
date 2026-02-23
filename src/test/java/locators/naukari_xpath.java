package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukari_xpath {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='socialbtn google']")).click();
	}

}
