package assaignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prokabaddi {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		WebElement str = driver.findElement(By.xpath("(//p[text()='Haryana Steelers']/ancestor::div[@class='row-head']/descendant::p[@class='count'])[1])"));
System.out.println(str);
	}

}
