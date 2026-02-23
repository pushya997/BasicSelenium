package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class displayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		boolean login = ele.isDisplayed();
		if(login)
		{
			System.out.println("login button is selected");
		}
		else
		{
			System.out.println("login button is not selected");
		}
		driver.close();
             
	}

}
