package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismUltiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select s= new Select(day);
		boolean b = s.isMultiple();
		if(b) {
			System.out.println("Day listbox is multiselectable");
		}
		else {
			System.out.println("Day listbox is not multiselectable");
		}

	}

}
