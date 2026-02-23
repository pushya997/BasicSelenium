package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	By n = By.id("nav-link-accountList");
	WebElement ele = driver.findElement(n);
	ele.click();
	Thread.sleep(2000);
	By newAcc = By.id("ab-registration-ingress-link");
	WebElement newAccEl = driver.findElement(newAcc);
	newAccEl.click();
	Thread.sleep(2000);
	By mail = By.id("businessEmail-field-id");
	WebElement m = driver.findElement(mail);
	m.sendKeys("abcd@gmail.com");
	Thread.sleep(2000);
	By btn = By.id("submit-email");
	WebElement btn1 = driver.findElement(btn);
	btn1.click();
	Thread.sleep(2000);
	driver.close();
	}

}
