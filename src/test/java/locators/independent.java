package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class independent {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver= new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("REDMI 9 Activ (Coral Green, 64 GB)");
driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
Thread.sleep(2000);
String str = driver.findElement(By.xpath("(//div[@class='KzDlHZ']/../..//div[@class='Nx9bqj _4b5DiR'])[1]")).getText();
System.out.println(str);
driver.close();


	}

}
