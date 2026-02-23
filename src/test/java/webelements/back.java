package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class back {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		 WebElement ele = driver.findElement(By.xpath("//input[contains(@id,'u_0_8')]"));
		 ele.sendKeys("pushya");
		 ele.sendKeys(Keys.CONTROL+"a");
		 ele.sendKeys(Keys.BACK_SPACE);
		 

	}

}
