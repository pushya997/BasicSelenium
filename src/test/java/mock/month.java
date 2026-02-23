package mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class month {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		List<WebElement> rv = s.getOptions();
		List<String> months = new ArrayList<String>();
		for(WebElement el: rv) {
			String str = el.getText();
			months.add(str);
		}
		Collections.sort(months);
		System.out.println(months);

	}

}
