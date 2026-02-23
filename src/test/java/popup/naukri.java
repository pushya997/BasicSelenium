package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.get("https://www.naukri.com/");
Thread.sleep(2000);
driver.findElement(By.id("login_Layer")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
Set<String> s = driver.getWindowHandles();
Iterator<String> itr = s.iterator();
while(itr.hasNext()) {
	String refid = itr.next();
	driver.switchTo().window(refid);  //need to check how to stop when switched
	
}
Thread.sleep(2000);
driver.findElement(By.id("identifierId")).sendKeys("pushyaragini997@gmail.com");


	}

}
