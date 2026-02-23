package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(2000);
	By un = By.name("username");
	WebElement ele = driver.findElement(un);
	ele.sendKeys("Pushya");
	Thread.sleep(2000);
	By pwd = By.name("password");
	WebElement ele1 = driver.findElement(pwd);
	ele1.sendKeys("abcd");
	driver.close();
	

	}

}
