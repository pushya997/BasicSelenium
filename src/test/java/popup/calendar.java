package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//img [@alt='cross']")).click();
		driver.findElement(By.className("css-w7k25o")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		//driver.findElement(By.className("react-datepicker__day--030")).click();
		driver.findElement(By.xpath("(//span[text()='July 2025']/ancestor::div[@class='react-datepicker__month-container']/descendant::span[text()='30'])[2]")).click();		
		//driver.findElement(By.xpath("//span[@aria-label='MAHA SHIVARATHIRI']")).click();
		
		//div class="react-datepicker__week"
	}

}
