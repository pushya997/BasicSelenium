package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//driver.findElement(By.id("u_0_a_FP")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		

	}

}
