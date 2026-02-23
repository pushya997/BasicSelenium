package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById('email').value='admin'");
	WebElement ele = driver.findElement(By.id("pass"));
	Thread.sleep(2000);
	js.executeScript("arguments[0].value='manager';", ele);
	Thread.sleep(2000);
	js.executeScript("document.getElementsByName('login')[0].click();");
	

	}

}
