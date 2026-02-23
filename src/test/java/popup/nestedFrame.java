package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrame {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames ");
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-left");
		String ele = driver.findElement(By.xpath("//body[contains(@text()='LEFT')")).getText();
		System.out.println(ele);
		
	
		

	}

}
