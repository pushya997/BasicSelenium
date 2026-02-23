package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class optimi_amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(2000);
		ele.click();
		WebElement newAccEl = driver.findElement(By.id("ab-registration-ingress-link"));
		Thread.sleep(2000);
		newAccEl.click();
		WebElement m = driver.findElement(By.id("businessEmail-field-id"));
				m.sendKeys("abcd@gmail.com");
				Thread.sleep(2000);
		WebElement btn1 = driver.findElement(By.id("submit-email"));
		btn1.click();
		Thread.sleep(2000);

	}

}
