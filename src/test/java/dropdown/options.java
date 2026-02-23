package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class options {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement year = driver.findElement(By.id("year"));
		Select s = new Select(year);
		List<WebElement> rv = s.getOptions();
		System.out.println(rv.size());
		

	}

}
