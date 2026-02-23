package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class select {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		 WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
		 WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
//action=1
		 female.click();
		 boolean b1 = female.isSelected();
		 if(b1)
		 {
			 System.out.println("Female option radio button is selected");
		 }
		 else
		 {
			 System.out.println("Female option radio button is not selected");
		 }
		 //action=2
		 male.click();
		 boolean b2 = male.isSelected();
		 if(b2)
		 {
			 System.out.println("Male radio button is selected");
		 }
		 else {
			 System.out.println("male radio boutton is not selected");
		 }
		 //action=3
		 boolean b3 = female.isSelected();
		 if(b3)
		 {
			 System.out.println("Female option radio button is selected");
		 }
		 else
		 {
			 System.out.println("Female option radio button is not selected");
		 }
		 
	}

}
