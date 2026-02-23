package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class enabled {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		boolean search = ele.isEnabled();
		if(search)
		{
			System.out.println("Search text field is enabled");
		}
		else {
			System.out.println("Search text field is disabled");
		}
	}

}
