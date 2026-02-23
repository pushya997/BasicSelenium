package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_path1 {

	public static void main(String[] args)
	{
	WebDriver driver= new ChromeDriver();
	driver.get(" https://www.saucedemo.com/v1/");
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

}
