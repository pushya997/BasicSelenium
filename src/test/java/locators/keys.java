package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abxgu@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("asdfgh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).sendKeys(Keys.ENTER);

	}

}
