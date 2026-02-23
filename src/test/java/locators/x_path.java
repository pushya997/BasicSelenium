package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_path {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abdh");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='u_0_5_Sv']")).click();
	
	
	

	}

}
