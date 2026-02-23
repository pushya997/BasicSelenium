package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class size {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
		Dimension mail = ele.getSize();
		System.out.println(mail.getHeight());
		System.out.println(mail.getWidth());
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='pass']"));
		Dimension pwd = ele.getSize();
		System.out.println(pwd.getHeight());
		System.out.println(pwd.getWidth());
		if(mail.getHeight()==pwd.getHeight() && mail.getWidth()==pwd.getWidth() ) {
			System.out.println("mail and pwd textfield dimension is same");
		}
		else {
			System.out.println("mail and pwd textfield dimension is not same");
			
				}
		
	}

}
