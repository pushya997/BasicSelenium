package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class move {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.partialLinkText("COMPUTERS"));
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
		driver.findElement(By.partialLinkText("Desktops")).click();
		
		

	}

}
