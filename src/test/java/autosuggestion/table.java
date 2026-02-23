package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/gpras/OneDrive/Desktop/table.html");
		List<WebElement> ref = driver.findElements(By.xpath("//td[3]"));
		int s = ref.size();
		System.out.println("Total no of marks="+s);
		for(int i=0;i<s;i++) {
			WebElement rv = ref.get(i);
			System.out.println(rv.getText());
		}
		

	}

}
