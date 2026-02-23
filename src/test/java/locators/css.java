package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class css {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div[id='nav-link-accountList']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[id='ab-registration-ingress-link']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='businessEmail-field-id']")).sendKeys("abcd@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[id='submit-email']")).click();
	

	}

}
