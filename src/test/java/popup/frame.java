package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) 
	{
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	//driver.switchTo().frame(0);
	//driver.switchTo().frame("SingleFrame");
	WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	driver.switchTo().frame(frame);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
	

	}

}
