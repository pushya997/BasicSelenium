package assaignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzz {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//div[@title='India Women won by 13 runs']")).click();
		driver.findElement(By.xpath("(//a[@class='cb-nav-tab '])[1]")).click();
		//driver.findElement(By.linkText(" Pratika Rawal "))

	}

}
