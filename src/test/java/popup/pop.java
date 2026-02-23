package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.close();
		
	}

}
