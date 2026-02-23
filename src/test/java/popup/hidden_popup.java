package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("login-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-google-link")).click();

	}

}
