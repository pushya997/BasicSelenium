package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mUltiselectable {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html ");
		WebElement day = driver.findElement(By.name("Month"));
		Select s= new Select(day);
		boolean b = s.isMultiple();
		if(b) {
			System.out.println("month listbox is multiselectable");
		}
		else {
			System.out.println("month listbox is not multiselectable");
		}
		List<WebElement> all = s.getOptions();
		for(int i=0;i<all.size();i++)
		{
			s.selectByIndex(i);
		}
		s.deselectByIndex(6);
		s.deselectByValue("Nov");
		s.deselectByVisibleText("February");
	}

}

