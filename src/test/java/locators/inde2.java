package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inde2 {

	public static void main(String[] args) 
	{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("OnePlus 13 | Smarter with OnePlus AI | Lifetime Display Warranty (12GB RAM, 256GB Storage Midnight Ocean)");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath(null));

	}

}
