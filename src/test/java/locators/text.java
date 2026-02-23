package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/free-online-trial");
		WebElement ele = driver.findElement(By.className("start-trial__title"));
		String str = ele.getText(); 
		System.out.println(str);

	}

}
